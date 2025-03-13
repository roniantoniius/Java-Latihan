package com.roniantonius.databasepostgre.dao.impl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

import javax.swing.tree.RowMapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import com.roniantonius.databasepostgre.dao.impl.PpnDaoImpl;
import com.roniantonius.databasepostgre.dao.impl.PpnDaoImpl.PpnRowMapper;
import com.roniantonius.databasepostgre.domain.Ppn;

@ExtendWith(MockitoExtension.class)
public class PpnDaoImplTests {
	@Mock
	private JdbcTemplate jdbcTemplate;
	
	@InjectMocks
	private PpnDaoImpl underTest;
	
	@Test
	public void testThatCreatePpnGeneratorCorrectQuery() {
		Ppn ppn = TestDataUtil.createTestPpnA();
		
		underTest.create(ppn);
		
		verify(jdbcTemplate).update(
				eq("INSERT INTO ppn (id, name, lokasi) VALUES (?, ?, ?)"),
				eq(1L), eq("karangantu"), eq("serang")
		);
	}

	@Test
	public void testThatFindOnePpnGeneratorCorrectQuery() {
		underTest.findOne(1L);
		verify(jdbcTemplate).query(
				eq("SELECT id, name, lokasi FROM ppn WHERE id = ? LIMIT 1"),
				ArgumentMatchers.<PpnDaoImpl.PpnRowMapper>any(),
				eq(1L));
	}
	
	@Test
	public void testThatFindManyPpnGenerateCorrectQuery() {
		underTest.find();
		verify(jdbcTemplate).query(
				eq("SELECT id, name, lokasi FROM ppn"),
				ArgumentMatchers.<PpnDaoImpl.PpnRowMapper>any()
		);
	}
	
	@Test
	public void testThatUpdateGenerateCorrectQuery() {
		Ppn ppn = TestDataUtil.createTestPpnA(;
		underTest.update(ppn);
		verify(null)
	}
}
