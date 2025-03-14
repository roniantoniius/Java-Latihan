package com.roniantonius.databasepostgre.dao.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.roniantonius.databasepostgre.dao.impl.KapalDaoImpl.KapalRowMapper;
import com.roniantonius.databasepostgre.domain.Kapal;
import com.roniantonius.databasepostgre.domain.Ppn;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class KapalDaoImplIntegrationTests {
	private PpnDaoImpl ppnDao;
	private KapalDaoImpl underTest;
	
	@Autowired
	public KapalDaoImplIntegrationTests(KapalDaoImpl underTest, PpnDaoImpl ppnDao) {
		this.underTest = underTest;
		this.ppnDao = ppnDao;
	}
	
	@Test
	public void testThatKapalCanBeCreatedAndRecalled() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		ppnDao.create(ppn);
		Kapal kapal = TestDataUtil.createTestKapalA();
		kapal.setPpnid(ppn.getId());
		underTest.create(kapal);
		Optional<Kapal> hasil = underTest.findOne(kapal.getIdkapal());
		Assertions.assertThat(hasil).isPresent();
		Assertions.assertThat(hasil.get()).isEqualTo(kapal);
	}
	
	@Test
	public void testThatMultipleKapalCanBeCreatedAndRecalled() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		ppnDao.create(ppn);
		
		Kapal kapalA = TestDataUtil.createTestKapalA();
		underTest.create(kapalA);
		kapalA.setPpnid(ppn.getId());
		Kapal kapalB = TestDataUtil.createTestKapalB();
		underTest.create(kapalB);
		kapalB.setPpnid(ppn.getId());
		Kapal kapalC = TestDataUtil.createTestKapalC();
		underTest.create(kapalC);
		kapalC.setPpnid(ppn.getId());
		
		List<Kapal> daftar = underTest.find();
		assertThat(daftar)
			.hasSize(3)
			.containsExactly(kapalA, kapalB, kapalC);
	}
	
	@Test
	public void testThatKapalCanBeUpdated() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		ppnDao.create(ppn);
		
		Kapal kapal = TestDataUtil.createTestKapalA();
		kapal.setPpnid(ppn.getId());
		underTest.create(kapal);
		
		kapal.setNamekapal("UPDATED");
		underTest.update(kapal.getIdkapal(), kapal);
		
		Optional<Kapal> hasilOptional = underTest.findOne(kapal.getIdkapal());
		assertThat(hasilOptional).isPresent();
		assertThat(hasilOptional.get()).isEqualTo(kapal);
	}
	
	@Test
	public void testThatKapalCanBeDeleted() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		ppnDao.create(ppn);
		
		Kapal kapal = TestDataUtil.createTestKapalA();
		kapal.setPpnid(ppn.getId());
		underTest.create(kapal);
		
		underTest.delete(kapal.getIdkapal());
		
		Optional<Kapal> hasil = underTest.findOne(kapal.getIdkapal());
		assertThat(hasil).isEmpty();
	}
}
