package com.roniantonius.databasepostgre.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.roniantonius.databasepostgre.dao.KapalDao;
import com.roniantonius.databasepostgre.domain.Kapal;
import com.roniantonius.databasepostgre.domain.Ppn;

@Component
public class KapalDaoImpl implements KapalDao{
	private final JdbcTemplate jdbcTemplate;
	public KapalDaoImpl(final JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void create(Kapal kapal) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(
				"INSERT INTO kapal (idkapal, namekapal, ukuran, ppnid) VALUES (?, ?, ?, ?)",
				kapal.getIdkapal(), kapal.getNamekapal(), kapal.getUkuran(), kapal.getPpnid()
		);
	}
	@Override
	public Optional<Kapal> findOne(Long kapalId) {
		// TODO Auto-generated method stub
		List<Kapal> hasil = jdbcTemplate.query(
				"SELECT idkapal, namekapal, ukuran, ppnid FROM kapal WHERE idkapal = ? LIMIT 1",
				new KapalRowMapper(), kapalId
		);
		
		return hasil.stream().findFirst();
	}
	
	public static class KapalRowMapper implements RowMapper<Kapal>{

		@Override
		public Kapal mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return Kapal.builder()
					.idkapal(rs.getLong("idkapal"))
					.namekapal(rs.getString("namekapal"))
					.ukuran(rs.getString("ukuran"))
					.ppnid(rs.getLong("ppnid"))
					.build();
		}
		
	}

	@Override
	public List<Kapal> find() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
				"SELECT idkapal, namekapal, ukuran, ppnid FROM kapal",
				new KapalRowMapper()
		);
	}
}
