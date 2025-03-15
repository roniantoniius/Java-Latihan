package com.roniantonius.databasepostgre.services;

import java.util.List;

import com.roniantonius.databasepostgre.domain.entities.KapalEntity;

public interface KapalService {
	KapalEntity createKapal(KapalEntity kapalEntity);
	List<KapalEntity> findAll();
}
