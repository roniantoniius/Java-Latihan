package com.roniantonius.databasepostgre.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roniantonius.databasepostgre.domain.dto.KapalDto;
import com.roniantonius.databasepostgre.domain.entities.KapalEntity;
import com.roniantonius.databasepostgre.mappers.Mapper;
import com.roniantonius.databasepostgre.services.KapalService;

@RestController
public class KapalController {
	private KapalService kapalService;
	private Mapper<KapalEntity, KapalDto> kapalMapper;
	public KapalController(KapalService kapalService, Mapper<KapalEntity, KapalDto> kMapper) {
		this.kapalService = kapalService;
		this.kapalMapper = kMapper;
	}
	
	@PostMapping(path = "/kapal-kapal")
	public ResponseEntity<KapalDto> createKapal(@RequestBody final KapalDto kapal){
		KapalEntity kapalEntity = kapalMapper.mapFrom(kapal);
		KapalEntity hasilKapal = kapalService.createKapal(kapalEntity); // disini datanya disimpan dalam database
		return new ResponseEntity<KapalDto>(kapalMapper.mapTo(hasilKapal), HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/kapal-kapal")
	public List<KapalDto> listKapal(){
		List<KapalEntity> kapalEntities = kapalService.findAll();
		return kapalEntities.stream()
				.map(kapalMapper::mapTo)
				.collect(Collectors.toList());
	}
}
