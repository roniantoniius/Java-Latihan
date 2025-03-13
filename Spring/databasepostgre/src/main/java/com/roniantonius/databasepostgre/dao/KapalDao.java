package com.roniantonius.databasepostgre.dao;

import java.util.List;
import java.util.Optional;

import com.roniantonius.databasepostgre.domain.Kapal;

public interface KapalDao {
	void create(Kapal kapal);
	Optional<Kapal> findOne(Long l);
	List<Kapal> find();
}
