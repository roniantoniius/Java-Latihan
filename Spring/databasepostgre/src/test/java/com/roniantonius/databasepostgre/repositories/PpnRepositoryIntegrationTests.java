package com.roniantonius.databasepostgre.repositories;

import java.util.List;
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
import com.roniantonius.databasepostgre.domain.Ppn;

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
        Ppn ppn = TestDataUtil.createTestPpnA();
        underTest.save(ppn);
        Optional<Ppn> hasil = underTest.findById(ppn.getId());
        
        assertThat(hasil).isPresent();
        assertThat(hasil.get()).isEqualTo(ppn);
    }
    
    @Test
    public void testThatMultiplePpnCanBeCreatedAndRecalled() {
        Ppn ppnA = TestDataUtil.createTestPpnA();
        underTest.save(ppnA);
        Ppn ppnB = TestDataUtil.createTestPpnB();
        underTest.save(ppnB);
        Ppn ppnC = TestDataUtil.createTestPpnC();
        underTest.save(ppnC);
        
        Iterable<Ppn> daftars = underTest.findAll();
        assertThat(daftars).hasSize(3).containsExactly(ppnA, ppnB, ppnC);
    }
    
    @Test
    public void testThatPpnCanBeUpdated() {
        Ppn ppn = TestDataUtil.createTestPpnA();
        underTest.save(ppn);
        ppn.setName("UPDATED");
        underTest.save(ppn);
        Optional<Ppn> hasil = underTest.findById(ppn.getId());
        
        assertThat(hasil).isPresent();
        assertThat(hasil.get().getId()).isEqualTo(ppn.getId());
        assertThat(hasil.get().getName()).isEqualTo(ppn.getName());
        assertThat(hasil.get().getLokasi()).isEqualTo(ppn.getLokasi());
        assertThat(hasil.get().getPpnYear()).isEqualTo(ppn.getPpnYear());
    }
    
    @Test
    public void testThatPpnCanBeDeleted() {
        Ppn ppn = TestDataUtil.createTestPpnA();
        underTest.save(ppn);
        underTest.deleteById(ppn.getId());
        Optional<Ppn> hasil = underTest.findById(ppn.getId());
        assertThat(hasil).isEmpty();
    }
    
    @Test
    public void testThatGetPpnWithYearLessThan() {
        Ppn ppnA = TestDataUtil.createTestPpnA();
        underTest.save(ppnA);
        Ppn ppnB = TestDataUtil.createTestPpnB();
        underTest.save(ppnB);
        Ppn ppnC = TestDataUtil.createTestPpnC();
        underTest.save(ppnC);
        
        Iterable<Ppn> hasil = underTest.ppnYearLessThan(1999);
        assertThat(hasil).containsExactly(ppnA, ppnB);
    }
    
    @Test
    public void testThatGetPpnWithYearGreaterThan() {
    	Ppn ppnA = TestDataUtil.createTestPpnA();
        underTest.save(ppnA);
        Ppn ppnB = TestDataUtil.createTestPpnB();
        underTest.save(ppnB);
        Ppn ppnC = TestDataUtil.createTestPpnC();
        underTest.save(ppnC);
        
        Iterable<Ppn> hasil = underTest.findPpnWithYearGreaterThan(1999);
        assertThat(hasil).containsExactly(ppnC);
    }
}