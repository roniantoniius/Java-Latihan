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
import com.roniantonius.databasepostgre.domain.dto.KapalDto;
import com.roniantonius.databasepostgre.domain.entities.KapalEntity;
import com.roniantonius.databasepostgre.domain.entities.PpnEntity;
import com.roniantonius.databasepostgre.services.KapalService;
import com.roniantonius.databasepostgre.services.PpnService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class KapalControllerIntegrationTests {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Autowired
    private KapalService kapalService;
    
    @Autowired
    private PpnService ppnService;
    
    private ObjectMapper objectMapper = new ObjectMapper();
    
    @Test
    public void testThatCreateKapalSuccessfulReturnHttp201() throws Exception {
        // Create and save a PPN entity first
        PpnEntity ppnEntity = TestDataUtil.createTestPpnB();
        PpnEntity savedPpn = ppnService.createPpn(ppnEntity);
        
        // Create KapalDto with the saved PPN id
        KapalDto kapalDto = KapalDto.builder()
                .namekapal("Matahari")
                .ukuran(14)
                .ppnid(savedPpn.getId())
                .build();
                
        String kapalJsonString = objectMapper.writeValueAsString(kapalDto);
        
        mockMvc.perform(
                MockMvcRequestBuilders.post("/kapal-kapal")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(kapalJsonString)
        ).andExpect(
                MockMvcResultMatchers.status().isCreated()
        );
    }
    
    @Test
    public void testThatCreateKapalSuccesfulyReturnSavaedKapal() throws Exception {
        // Create and save a PPN entity first
        PpnEntity ppnEntity = TestDataUtil.createTestPpnB();
        PpnEntity savedPpn = ppnService.createPpn(ppnEntity);
        
        // Create KapalDto with the saved PPN id
        KapalDto kapalDto = KapalDto.builder()
                .namekapal("Matahari")
                .ukuran(14)
                .ppnid(savedPpn.getId())
                .build();
                
        String kapalJsonString = objectMapper.writeValueAsString(kapalDto);
        
        mockMvc.perform(
                MockMvcRequestBuilders.post("/kapal-kapal")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(kapalJsonString)
        ).andExpect(
            MockMvcResultMatchers.jsonPath("$.idkapal").isNumber()
        ).andExpect(
            MockMvcResultMatchers.jsonPath("$.namekapal").value("Matahari")
        ).andExpect(
            MockMvcResultMatchers.jsonPath("$.ukuran").value(14)    
        ).andExpect(
            MockMvcResultMatchers.jsonPath("$.ppnid").isNumber()
        );
    }
    
    @Test
    public void testThatFindListKapalSuccessReturn200OK() throws Exception { // this test resulting 404 instead 200
    	mockMvc.perform(
    			MockMvcRequestBuilders.get("/buku-buku")
    			.contentType(MediaType.APPLICATION_JSON)
    	).andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    @Test
    public void testThatFindListKapalSuccessReturnList() throws Exception {
        KapalEntity kapalEntity = TestDataUtil.createTestKapalA(null);
        kapalService.createKapal(kapalEntity);
        
        mockMvc.perform(
        		MockMvcRequestBuilders.get("/kapal-kapal")
        		.contentType(MediaType.APPLICATION_JSON)
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$[0].idkapal").isNumber()
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$[0].namekapal").value("Bintang")
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$[0].ukuran").value(3)
        );
    }
}