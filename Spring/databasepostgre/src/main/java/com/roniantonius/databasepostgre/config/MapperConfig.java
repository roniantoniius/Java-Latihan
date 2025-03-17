package com.roniantonius.databasepostgre.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
	@Bean
	public ModelMapper modelMapper() {
		// dengan menggunakan metode ini, kita bisa membuat nested Objek pada satu Dto Response Body
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
//		return modelMapper;
		return new ModelMapper();
	}
}