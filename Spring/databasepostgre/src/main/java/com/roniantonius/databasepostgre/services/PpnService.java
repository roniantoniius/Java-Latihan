package com.roniantonius.databasepostgre.services;

import java.util.List;
import java.util.Optional;

import com.roniantonius.databasepostgre.domain.entities.PpnEntity;

public interface PpnService {
	PpnEntity save(PpnEntity ppnEntity);
	List<PpnEntity> findAll();
	Optional<PpnEntity> findOne(Long id);
	boolean isExists(Long id);
	PpnEntity partialUpdate(Long id, PpnEntity ppnEntity);
}
