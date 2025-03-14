package com.roniantonius.databasepostgre.dao;

import java.util.List;
import java.util.Optional;

import com.roniantonius.databasepostgre.domain.Ppn;

public interface PpnDao {
	void create(Ppn ppn);
	Optional<Ppn> findOne(Long l);
	List<Ppn> find();
	void update(Long id, Ppn ppn);
	void delete(Long id);
}
