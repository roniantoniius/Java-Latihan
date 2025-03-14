package com.roniantonius.databasepostgre.repositories;

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

import com.roniantonius.databasepostgre.TestDataUtil;
import com.roniantonius.databasepostgre.domain.Kapal;
import com.roniantonius.databasepostgre.domain.Ppn;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class KapalRepositoryIntegrationTests {
	private KapalRepository underTest;
	private PpnRepository ppnRepository;
	
	@Autowired
	public KapalRepositoryIntegrationTests(KapalRepository underTest, PpnRepository ppnRepository) {
		this.underTest = underTest;
		this.ppnRepository = ppnRepository;
	}
	
	@Test
	public void testThatKapalCanBeCreatedAndRecalled() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		Kapal kapal = TestDataUtil.createTestKapalA(ppn);
		underTest.save(kapal);
		Optional<Kapal> hasil = underTest.findById(kapal.getIdkapal());
		Assertions.assertThat(hasil).isPresent();
		Assertions.assertThat(hasil.get()).isEqualTo(kapal);
	}
	
//	@Test
//	public void testThatMultipleKapalCanBeCreatedAndRecalled() {
//		Ppn ppn = TestDataUtil.createTestPpnA();
//		ppnRepository.save(ppn);
//		Kapal kapalA = TestDataUtil.createTestKapalA(ppn);
//		underTest.save(kapalA);
//		Kapal kapalB = TestDataUtil.createTestKapalB(ppn);
//		underTest.save(kapalB);
//		Kapal kapalC = TestDataUtil.createTestKapalC(ppn);
//		underTest.save(kapalC);
//		
//		Iterable<Kapal> daftar = underTest.findAll();
//		assertThat(daftar)
//			.hasSize(3)
//			.containsExactly(kapalA, kapalB, kapalC);
//	}
	
	@Test
	public void testThatKapalCanBeUpdated() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		
		Kapal kapal = TestDataUtil.createTestKapalA(ppn);
		underTest.save(kapal);
		
		kapal.setNamekapal("UPDATED");
		underTest.save(kapal);
		
		Optional<Kapal> hasilOptional = underTest.findById(kapal.getIdkapal());
		assertThat(hasilOptional).isPresent();
		assertThat(hasilOptional.get()).isEqualTo(kapal);
	}
	
	@Test
	public void testThatKapalCanBeDeleted() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		
		Kapal kapal = TestDataUtil.createTestKapalA(ppn);
		underTest.save(kapal);
		
		underTest.deleteById(kapal.getIdkapal());
		
		Optional<Kapal> hasil = underTest.findById(kapal.getIdkapal());
		assertThat(hasil).isEmpty();
	}
}