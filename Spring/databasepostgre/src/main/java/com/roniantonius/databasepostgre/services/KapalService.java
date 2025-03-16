package com.roniantonius.databasepostgre.services;

import java.util.List;
import java.util.Optional;

import com.roniantonius.databasepostgre.domain.entities.KapalEntity;

public interface KapalService {
	KapalEntity save(KapalEntity kapalEntity);
	List<KapalEntity> findAll();
	Optional<KapalEntity> find(Long idkapal);
	boolean isExist(Long id);
}
