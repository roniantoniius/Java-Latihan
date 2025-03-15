package com.roniantonius.databasepostgre.services;

import java.util.List;

import com.roniantonius.databasepostgre.domain.entities.PpnEntity;

public interface PpnService {
	PpnEntity createPpn(PpnEntity ppnEntity);
	List<PpnEntity> findAll();
}
