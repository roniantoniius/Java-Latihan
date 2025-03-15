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
    public void testThatFindListPpnSuccesfullyReturn201() throws Exception{
    	mockMvc.perform(
    			MockMvcRequestBuilders.get("/ppn")
    			.contentType(MediaType.APPLICATION_JSON)
    	).andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    @Test
    public void testThatFindListPpnSuccesfullyReturnPpnList() throws Exception {
    	PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
    	ppnService.createPpn(ppnEntity);
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
}