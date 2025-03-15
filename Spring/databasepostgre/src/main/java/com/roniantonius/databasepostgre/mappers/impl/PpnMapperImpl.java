package com.roniantonius.databasepostgre.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.roniantonius.databasepostgre.domain.dto.PpnDto;
import com.roniantonius.databasepostgre.domain.entities.PpnEntity;
import com.roniantonius.databasepostgre.mappers.Mapper;

@Component
public class PpnMapperImpl implements Mapper<PpnEntity, PpnDto>{
	private ModelMapper modelMapper;
	public PpnMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	@Override
	public PpnDto mapTo(PpnEntity ppnEntity) {
		// TODO Auto-generated method stub
		return modelMapper.map(ppnEntity, PpnDto.class);
	}
	@Override
	public PpnEntity mapFrom(PpnDto ppnDto) {
		// TODO Auto-generated method stub
		return modelMapper.map(ppnDto, PpnEntity.class);
	}
	
	
}
