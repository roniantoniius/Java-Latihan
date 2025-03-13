package com.roniantonius.databasepostgre.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.roniantonius.databasepostgre.dao.PpnDao;
import com.roniantonius.databasepostgre.domain.Ppn;

@Component
public class PpnDaoImpl implements PpnDao{
	private final JdbcTemplate jdbcTemplate;
	public PpnDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void create(Ppn ppn) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(
				"INSERT INTO ppn (id, name, lokasi) VALUES (?, ?, ?)",
				ppn.getId(), ppn.getName(), ppn.getLokasi()
		);
	}
	@Override
	public Optional<Ppn> findOne(Long PpnId) {
		// TODO Auto-generated method stub
		List<Ppn> hasil = jdbcTemplate.query(
				"SELECT id, name, lokasi FROM ppn WHERE id = ? LIMIT 1",
				new PpnRowMapper(), PpnId);
		
		return hasil.stream().findFirst();
	}
	
	public static class PpnRowMapper implements RowMapper<Ppn>{

		@Override
		public Ppn mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return Ppn.builder()
					.id(rs.getLong("id"))
					.name(rs.getString("name"))
					.lokasi(rs.getString("lokasi"))
					.build();
		}
		
	}

	@Override
	public List<Ppn> find() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
				"SELECT id, name, lokasi FROM ppn",
				new PpnRowMapper()
		);
	}
	@Override
	public void update(Ppn ppn) {
		// TODO Auto-generated method stub
		
	}
}
