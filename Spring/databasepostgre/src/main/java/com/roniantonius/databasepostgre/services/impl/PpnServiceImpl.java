package com.roniantonius.databasepostgre.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.modelmapper.internal.bytebuddy.asm.Advice.Return;
import org.springframework.stereotype.Service;

import com.roniantonius.databasepostgre.domain.entities.PpnEntity;
import com.roniantonius.databasepostgre.repositories.PpnRepository;
import com.roniantonius.databasepostgre.services.PpnService;

// this code purpose is for Implementation Service Layer, meaning that we can Crud here
@Service
public class PpnServiceImpl implements PpnService{
	private PpnRepository ppnRepository; // ini objek Crud
	public PpnServiceImpl(PpnRepository ppnRepository) {
		this.ppnRepository = ppnRepository;
	}
	@Override
	public PpnEntity save(PpnEntity ppnEntity) {
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
	@Override
	public Optional<PpnEntity> findOne(Long id) {
		// TODO Auto-generated method stub
		return ppnRepository.findById(id);
	}
	@Override
	public boolean isExists(Long id) {
		// TODO Auto-generated method stub
		return ppnRepository.existsById(id);
	}
	@Override
	public PpnEntity partialUpdate(Long id, PpnEntity ppnEntity) {
		// TODO Auto-generated method stub
		ppnEntity.setId(id);
		return ppnRepository.findById(id).map(entityAda -> {
			Optional.ofNullable(ppnEntity.getName()).ifPresent(entityAda::setName);
			Optional.ofNullable(ppnEntity.getLokasi()).ifPresent(entityAda::setLokasi);
			Optional.ofNullable(ppnEntity.getPpnYear()).ifPresent(entityAda::setPpnYear);
			return ppnRepository.save(entityAda);
		}).orElseThrow(() -> new RuntimeException("Ppn tidak ditemukan"));
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ppnRepository.deleteById(id);
	}
	
}
