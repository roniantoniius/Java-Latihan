package com.roniantonius.databasepostgre.repositories;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.roniantonius.databasepostgre.TestDataUtil;
import com.roniantonius.databasepostgre.domain.entities.PpnEntity;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@ActiveProfiles("test")
public class PpnRepositoryIntegrationTests {
    private PpnRepository underTest;
    
    @Autowired
    public PpnRepositoryIntegrationTests(PpnRepository underTest) {
        this.underTest = underTest;
    }
    
    @Test
    public void testThatPpnCanBeCreatedAndRecalled() {
        PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
        underTest.save(ppnEntity);
        Optional<PpnEntity> hasil = underTest.findById(ppnEntity.getId());
        
        assertThat(hasil).isPresent();
        assertThat(hasil.get()).isEqualTo(ppnEntity);
    }
    
    @Test
    public void testThatMultiplePpnCanBeCreatedAndRecalled() {
        PpnEntity ppnA = TestDataUtil.createTestPpnA();
        underTest.save(ppnA);
        PpnEntity ppnB = TestDataUtil.createTestPpnB();
        underTest.save(ppnB);
        PpnEntity ppnC = TestDataUtil.createTestPpnC();
        underTest.save(ppnC);
        
        Iterable<PpnEntity> daftars = underTest.findAll();
        assertThat(daftars).hasSize(3).containsExactly(ppnA, ppnB, ppnC);
    }
    
    @Test
    public void testThatPpnCanBeUpdated() {
        PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
        underTest.save(ppnEntity);
        ppnEntity.setName("UPDATED");
        underTest.save(ppnEntity);
        Optional<PpnEntity> hasil = underTest.findById(ppnEntity.getId());
        
        assertThat(hasil).isPresent();
        assertThat(hasil.get().getId()).isEqualTo(ppnEntity.getId());
        assertThat(hasil.get().getName()).isEqualTo(ppnEntity.getName());
        assertThat(hasil.get().getLokasi()).isEqualTo(ppnEntity.getLokasi());
        assertThat(hasil.get().getPpnYear()).isEqualTo(ppnEntity.getPpnYear());
    }
    
    @Test
    public void testThatPpnCanBeDeleted() {
        PpnEntity ppnEntity = TestDataUtil.createTestPpnA();
        underTest.save(ppnEntity);
        underTest.deleteById(ppnEntity.getId());
        Optional<PpnEntity> hasil = underTest.findById(ppnEntity.getId());
        assertThat(hasil).isEmpty();
    }
    
    @Test
    public void testThatGetPpnWithYearLessThan() {
        PpnEntity ppnA = TestDataUtil.createTestPpnA();
        underTest.save(ppnA);
        PpnEntity ppnB = TestDataUtil.createTestPpnB();
        underTest.save(ppnB);
        PpnEntity ppnC = TestDataUtil.createTestPpnC();
        underTest.save(ppnC);
        
        Iterable<PpnEntity> hasil = underTest.ppnYearLessThan(1999);
        assertThat(hasil).containsExactly(ppnA, ppnB);
    }
    
    @Test
    public void testThatGetPpnWithYearGreaterThan() {
    	PpnEntity ppnA = TestDataUtil.createTestPpnA();
        underTest.save(ppnA);
        PpnEntity ppnB = TestDataUtil.createTestPpnB();
        underTest.save(ppnB);
        PpnEntity ppnC = TestDataUtil.createTestPpnC();
        underTest.save(ppnC);
        
        Iterable<PpnEntity> hasil = underTest.findPpnWithYearGreaterThan(1999);
        assertThat(hasil).containsExactly(ppnC);
    }
}