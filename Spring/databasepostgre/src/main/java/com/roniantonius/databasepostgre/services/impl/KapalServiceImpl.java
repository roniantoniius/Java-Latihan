package com.roniantonius.databasepostgre.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.roniantonius.databasepostgre.domain.entities.KapalEntity;
import com.roniantonius.databasepostgre.repositories.KapalRepository;
import com.roniantonius.databasepostgre.services.KapalService;

@Service
public class KapalServiceImpl implements KapalService{
	private KapalRepository kapalRepository;
	public KapalServiceImpl(KapalRepository kapalRepository) {
		this.kapalRepository = kapalRepository;
	}
	@Override
	public KapalEntity save(KapalEntity kapalEntity) {
		// TODO Auto-generated method stub
		return kapalRepository.save(kapalEntity);
	}
	@Override
	public List<KapalEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(kapalRepository
				.findAll()
				.spliterator()
				, false)
				.collect(Collectors.toList());
	}
	@Override
	public Optional<KapalEntity> find(Long idkapal) {
		// TODO Auto-generated method stub
		return kapalRepository.findById(idkapal);
	}
	@Override
	public boolean isExist(Long id) {
		// TODO Auto-generated method stub
		return kapalRepository.existsById(id);
	}	
}