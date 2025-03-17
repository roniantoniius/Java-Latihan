package com.roniantonius.databasepostgre.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.roniantonius.databasepostgre.domain.entities.KapalEntity;

public interface KapalService {
	KapalEntity save(KapalEntity kapalEntity);
	List<KapalEntity> findAll();
	Page<KapalEntity> findAll(Pageable pageable);
	Optional<KapalEntity> find(Long idkapal);
	boolean isExist(Long id);
	KapalEntity partialUpdate(Long id, KapalEntity kapalEntity);
	void delete(Long id);
}