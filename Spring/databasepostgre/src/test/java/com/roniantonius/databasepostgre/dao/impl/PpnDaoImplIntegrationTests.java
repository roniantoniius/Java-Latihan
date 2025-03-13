package com.roniantonius.databasepostgre.dao.impl;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.roniantonius.databasepostgre.domain.Ppn;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class PpnDaoImplIntegrationTests {
	private PpnDaoImpl underTest;
	
	@Autowired // ini menandakan Spring supaya method di bawah menerapkan Dependency injection
	public PpnDaoImplIntegrationTests(PpnDaoImpl underTest) {
		this.underTest = underTest;
	}
	
	@Test
	public void testThatPpnCanBeCreatedAndRecalled() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		underTest.create(ppn);
		Optional<Ppn> hasil = underTest.findOne(ppn.getId());
		
		assertThat(hasil).isPresent();
		assertThat(hasil.get()).isEqualTo(ppn);
	}
	
	@Test
	public void testThatMultiplePpnCanBeCreatedAndRecalled() {
		Ppn ppnA = TestDataUtil.createTestPpnA();
		underTest.create(ppnA);
		Ppn ppnB = TestDataUtil.createTestPpnB();
		underTest.create(ppnB);
		Ppn ppnC = TestDataUtil.createTestPpnC();
		underTest.create(ppnC);
		
		List<Ppn> daftars = underTest.find();
		assertThat(daftars).hasSize(3).containsExactly(ppnA, ppnB, ppnC);
	}
}
