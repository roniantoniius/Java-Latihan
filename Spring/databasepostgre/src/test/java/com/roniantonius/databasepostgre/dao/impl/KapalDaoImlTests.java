package com.roniantonius.databasepostgre.dao.impl;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import com.roniantonius.databasepostgre.dao.impl.KapalDaoImpl;
import com.roniantonius.databasepostgre.domain.Kapal;

@ExtendWith(MockitoExtension.class)
public class KapalDaoImlTests {
	@Mock
	private JdbcTemplate jdbcTemplate;
	
	@InjectMocks
	private KapalDaoImpl underTest;
	
	@Test
	public void testThatCreateKapalGeneratorQuery() {
		Kapal kapal = TestDataUtil.createTestKapalA();
		
		underTest.create(kapal);
		
		verify(jdbcTemplate).update(
				eq("INSERT INTO kapal (idkapal, namekapal, ukuran, ppnid) VALUES (?, ?, ?, ?)"),
				eq(1L), eq("Bintang"), eq("3GT"), eq(1L)
		);
	}

	@Test
	public void testThatCreateFindOneKapalQuery() {
		underTest.findOne(1L);
		verify(jdbcTemplate).query(
				eq("SELECT idkapal, namekapal, ukuran, ppnid FROM kapal WHERE idkapal = ? LIMIT 1"),
				ArgumentMatchers.<KapalDaoImpl.KapalRowMapper>any(),
				eq(1L)
		);
	}
	
	@Test
	public void testThatFindGenerateKapalQuery() {
		underTest.find();
		verify(jdbcTemplate).query(
				"SELECT idkapal, namekapal, ukuran, ppnid FROM kapal",
				ArgumentMatchers.<KapalDaoImpl.KapalRowMapper>any()
		);
	}
}
