package com.roniantonius.databasepostgre.services.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.roniantonius.databasepostgre.domain.entities.PpnEntity;
import com.roniantonius.databasepostgre.repositories.PpnRepository;
import com.roniantonius.databasepostgre.services.PpnService;

// this code purpose is for Implementation Service Layer, meaning that we can Crud here
@Service
public class PpnServiceImpl implements PpnService{
	private PpnRepository ppnRepository;
	public PpnServiceImpl(PpnRepository ppnRepository) {
		this.ppnRepository = ppnRepository;
	}
	@Override
	public PpnEntity createPpn(PpnEntity ppnEntity) {
		// TODO Auto-generated method stub
		return ppnRepository.save(ppnEntity);
	}
	@Override
	public List<PpnEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(ppnRepository // api pembantu untuk strem
				.findAll()
				.spliterator() // disini kita pengen secara paralel dipisahkan
				, false) // tanpa pemisah
				.collect(Collectors.toList());
	}
	
}
