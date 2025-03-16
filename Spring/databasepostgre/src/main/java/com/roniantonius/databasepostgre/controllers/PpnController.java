package com.roniantonius.databasepostgre.controllers;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.internal.bytebuddy.asm.Advice.Return;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
// Presentation Layer
// this file purpose is for providing DTO (Data transffer object) into presentation layer, through PpnService
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roniantonius.databasepostgre.domain.dto.PpnDto;
import com.roniantonius.databasepostgre.domain.entities.PpnEntity;
import com.roniantonius.databasepostgre.mappers.Mapper;
import com.roniantonius.databasepostgre.services.PpnService;

@RestController
public class PpnController {
	
	private PpnService ppnService;
	private Mapper<PpnEntity, PpnDto> ppnMapper;
	
	public PpnController(PpnService ppnService, Mapper<PpnEntity, PpnDto> pMapper) {
		this.ppnService = ppnService;
		this.ppnMapper = pMapper;
	}
	
	@PostMapping(path = "/ppn")
	public ResponseEntity<PpnDto> createPpn(@RequestBody final PpnDto ppn) { //Object Response Entity supaya nanti kita mengetahui response status dari api
		PpnEntity ppnEntity = ppnMapper.mapFrom(ppn);
		PpnEntity ppnEntityHasil = ppnService.save(ppnEntity);
		return new ResponseEntity<PpnDto>(ppnMapper.mapTo(ppnEntityHasil), HttpStatus.CREATED);
	}
	
	// mengambil list dari database
	@GetMapping(path = "/ppn")
	public List<PpnDto> listPpn(){
		List<PpnEntity> ppnEntities = ppnService.findAll();
		return ppnEntities.stream()
				.map(ppnMapper::mapTo).collect(Collectors.toList()); // disini kita pass si DTO nya
	}
	
	@GetMapping(path = "/ppn/{id}")
	public ResponseEntity<PpnDto> getPpn(@PathVariable("id") Long id){
		Optional<PpnEntity> ppnOptional = ppnService.findOne(id); // ambil data dari persistance (db) menggunakan service dalam entity
		return ppnOptional.map(ppnEntity -> { // kita ubah atau map si entity menjadi mapper
			PpnDto ppnDto = ppnMapper.mapTo(ppnEntity);
			return new ResponseEntity<>(ppnDto, HttpStatus.OK);
		}).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PutMapping(path = "/ppn/{id}")
	public ResponseEntity<PpnDto> fullUpdatePpn(@PathVariable("id") Long id, @RequestBody final PpnDto ppn){
		if (!ppnService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
		ppn.setId(id);
		PpnEntity ppnEntity = ppnMapper.mapFrom(ppn);
		PpnEntity ppnEntitySimpan = ppnService.save(ppnEntity);
		return new ResponseEntity<>(ppnMapper.mapTo(ppnEntitySimpan), HttpStatus.OK);
	}
	
	@PatchMapping(path = "/ppn/{id}")
	public ResponseEntity<PpnDto> partialUpdatePpn(@PathVariable("id") Long id, @RequestBody final PpnDto ppnDto){
		if (!ppnService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		PpnEntity ppnEntity = ppnMapper.mapFrom(ppnDto);
		PpnEntity ppnEntitySimpan = ppnService.partialUpdate(id, ppnEntity); // disini service layer kita sekalian cari id
		return new ResponseEntity<>(ppnMapper.mapTo(ppnEntitySimpan), HttpStatus.OK);
	}
}
