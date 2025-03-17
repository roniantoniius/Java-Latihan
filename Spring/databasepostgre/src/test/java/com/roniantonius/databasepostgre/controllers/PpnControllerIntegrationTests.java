package com.roniantonius.databasepostgre.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.roniantonius.databasepostgre.TestDataUtil;
import com.roniantonius.databasepostgre.domain.dto.PpnDto;
import com.roniantonius.databasepostgre.domain.entities.PpnEntity;
import com.roniantonius.databasepostgre.services.PpnService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class PpnControllerIntegrationTests {

    @Autowired
    private PpnService ppnService;

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();
    // test dari data entitas yang merupakan sebuah entitas atau Java Object
    @Test
    public void testThatCreatePpnSuccessfulyReturnHttp201Created() throws Exception {
        PpnEntity ppnEntity = TestDataUtil.createTestPpnB();
        ppnEntity.setId(null);
        String ppnJson = objectMapper.writeValueAsString(ppnEntity); // membuat json dari entitas

        mockMvc.perform(
            MockMvcRequestBuilders.post("/ppn")
                .contentType(MediaType.APPLICATION_JSON) 
                .content(ppnJson) // memasukkan json ke body
        ).andExpect(
            MockMvcResultMatchers.status().isCreated()
        );
    }
    
    @Test
    public void testThatCreatePpnSuccesfulyReturnSavaedPpn() throws Exception{
    	PpnEntity ppnEntity = TestDataUtil.createTestPpnC();
    	ppnEntity.setId(null);
    	String hasilJson = objectMapper.writeValueAsString(ppnEntity);
    	
    	mockMvc.perform(
    			MockMvcRequestBuilders.post("/ppn")
    				.contentType(MediaType.APPLICATION_JSON)
    				.content(hasilJson)
    	).andExpect(
    		MockMvcResultMatchers.jsonPath("$.id").isNumber()
    	).andExpect(
    		MockMvcResultMatchers.jsonPath("$.name").value("kariimun")
    	).andExpect(
    		MockMvcResultMatchers.jsonPath("$.ppnYear").value(2003)	
    	);
    }
    
    @Test
    public void testThatFindListPpnSuccesfullyReturn200() throws Exception{
    	mockMvc.perform(
    			MockMvcRequestBuilders.get("/ppn")
    			.contentType(MediaType.APPLICATION_JSON)
    	).andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    @Test
    public void testThatFindListPpnSuccesfullyReturnPpnList() throws Exception {
    	PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
    	ppnService.save(ppnEntity);
    	mockMvc.perform(
    		MockMvcRequestBuilders.get("/ppn")
    		.contentType(MediaType.APPLICATION_JSON)
    	).andExpect(
        		MockMvcResultMatchers.jsonPath("$[0].id").isNumber()
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$[0].name").value("karangantu")
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$[0].lokasi").value("serang")	
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$[0].ppnYear").value(1990)	
    	);
    }
    
    @Test
    public void testThatFindOnePpnReturnSuccesfullyStatus200WhenPpnExist() throws Exception{
    	PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
    	ppnService.save(ppnEntity);
    	mockMvc.perform(
    			MockMvcRequestBuilders.get("/ppn/1")
    			.contentType(MediaType.APPLICATION_JSON)
    	).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(
        		MockMvcResultMatchers.jsonPath("$.id").value(1)
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$.name").value("karangantu")
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$.lokasi").value("serang")	
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$.ppnYear").value(1990)	
    	);
    }
    
    @Test
    public void testThatFindOnePpnReturnFailedStatus404WhenPpnDontExist() throws Exception{
    	mockMvc.perform(
    			MockMvcRequestBuilders.get("/ppn/972")
    			.contentType(MediaType.APPLICATION_JSON)
    	).andExpect(MockMvcResultMatchers.status().isNotFound());
    }
    
    @Test
    public void testThatFullUpdatePpnReturnHTTPStatus404WhenNoPpnExist() throws Exception{
    	PpnDto ppnDto = TestDataUtil.createTestPpnDtoA();
    	String jsonPpnDto = objectMapper.writeValueAsString(ppnDto);
    	mockMvc.perform(
    			MockMvcRequestBuilders.put("/ppn/9921")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(jsonPpnDto)
    	).andExpect(MockMvcResultMatchers.status().isNotFound());
    }
    
//    @Test 
//    public void testThatFullUpdatePpnReturnHTTPStatus200WhenPpnExist() throws Exception{ // this test fail because the id is autogenerated (look at TestDataUtil)
//    	PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
//    	PpnEntity ppnEntitySaved = ppnService.save(ppnEntity);
//    	
//    	PpnDto ppnDto = TestDataUtil.createTestPpnDtoA();
//    	String jsonPpnDto = objectMapper.writeValueAsString(ppnDto);
//    	mockMvc.perform(
//    			MockMvcRequestBuilders.put("/ppn/" + ppnEntitySaved.getId())
//    			.contentType(MediaType.APPLICATION_JSON)
//    			.content(jsonPpnDto)
//    	).andExpect(MockMvcResultMatchers.status().isOk());
//    }
//    @Test 
//    public void testThatFullUpdateExistingPpn() throws Exception{ // this test trying to edit some Ppn data by just changing the current id into past id
//    	PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
//    	PpnEntity ppnEntitySaved = ppnService.save(ppnEntity);
//    	
//    	PpnDto ppnDto = TestDataUtil.createTestPpnDtoB();
//    	ppnDto.setId(ppnEntitySaved.getId());
//    	
//    	String jsonPpnDto = objectMapper.writeValueAsString(ppnDto);
//    	mockMvc.perform(
//    			MockMvcRequestBuilders.put("/ppn/" + ppnEntitySaved.getId())
//    			.contentType(MediaType.APPLICATION_JSON)
//    			.content(jsonPpnDto)
//    	).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(
//        		MockMvcResultMatchers.jsonPath("$.id").value(ppnEntitySaved.getId())
//    	).andExpect(
//    	    	MockMvcResultMatchers.jsonPath("$.name").value(ppnDto.getName())
//    	).andExpect(
//    	    	MockMvcResultMatchers.jsonPath("$.lokasi").value(ppnDto.getLokasi())	
//    	).andExpect(
//    	    	MockMvcResultMatchers.jsonPath("$.ppnYear").value(ppnDto.getPpnYear())	
//    	);
//    }
    
    @Test 
    public void testThatPartialUpdateExistingPpnReturnUpdatedPartialPpn() throws Exception{ // this test fail because the id is autogenerated (look at TestDataUtil)
    	PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
    	PpnEntity ppnEntitySaved = ppnService.save(ppnEntity);
    	
    	PpnDto ppnDto = TestDataUtil.createTestPpnDtoA();
    	ppnDto.setName("BMKG Jakarta");
    	String jsonPpnDto = objectMapper.writeValueAsString(ppnDto);
    	mockMvc.perform(
    			MockMvcRequestBuilders.patch("/ppn/" + ppnEntitySaved.getId())
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(jsonPpnDto)
    	).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(
        		MockMvcResultMatchers.jsonPath("$.id").value(ppnEntitySaved.getId())
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$.name").value("BMKG Jakarta")
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$.lokasi").value(ppnDto.getLokasi())	
    	).andExpect(
    	    	MockMvcResultMatchers.jsonPath("$.ppnYear").value(ppnDto.getPpnYear())	
    	);
    }
    @Test
    public void testThatDeletePpnReturnHttpStatus204ForNonExistingPpn() throws Exception {
    	mockMvc.perform(
    			MockMvcRequestBuilders.delete("/ppn/9242")
    			.contentType(MediaType.APPLICATION_JSON)
    	).andExpect(MockMvcResultMatchers.status().isNoContent());
    }
    
    @Test
    public void testThatDeletePpnReturnHttpStatus204ForExistingPpn() throws Exception {
    	PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
    	PpnEntity ppnEntitySaved = ppnService.save(ppnEntity);
    	mockMvc.perform(
    			MockMvcRequestBuilders.delete("/ppn/" + ppnEntitySaved.getId())
    			.contentType(MediaType.APPLICATION_JSON)
    	).andExpect(MockMvcResultMatchers.status().isNoContent());
    }
}