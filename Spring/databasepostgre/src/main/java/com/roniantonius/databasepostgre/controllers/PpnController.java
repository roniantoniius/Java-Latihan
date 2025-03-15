package com.roniantonius.databasepostgre.controllers;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// Presentation Layer
// this file purpose is for providing DTO (Data transffer object) into presentation layer, through PpnService
import org.springframework.web.bind.annotation.PostMapping;
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
	public ResponseEntity<PpnDto> createPpn(@RequestBody final PpnDto ppn) {
		PpnEntity ppnEntity = ppnMapper.mapFrom(ppn);
		PpnEntity ppnEntityHasil = ppnService.createPpn(ppnEntity);
		return new ResponseEntity<PpnDto>(ppnMapper.mapTo(ppnEntityHasil), HttpStatus.CREATED);
	}
	
	// mengambil list dari database
	@GetMapping(path = "/ppn")
	public List<PpnDto> listPpn(){
		List<PpnEntity> ppnEntities = ppnService.findAll();
		return ppnEntities.stream()
				.map(ppnMapper::mapTo).collect(Collectors.toList()); // disini kita pass si DTO nya
	}
}
