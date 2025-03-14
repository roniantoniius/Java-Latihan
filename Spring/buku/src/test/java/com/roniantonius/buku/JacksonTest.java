package com.roniantonius.buku;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.roniantonius.buku.Domain.Buku;

public class JacksonTest {
	@Test
	public void testThatObjectMapperCanCreateJsonFromJavaObject() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		Buku buku = Buku.builder()
				.nib("122-123-123-123")
				.nama("Unity in Motion")
				.penulis("Sutomo")
				.tahunTerbit("2022")
				.build();
		
		String hasil = objectMapper.writeValueAsString(buku);
		assertThat(hasil).isEqualTo("{\"nib\":\"122-123-123-123\",\"nama\":\"Unity in Motion\",\"penulis\":\"Sutomo\",\"tahun\":\"2022\"}");
	}
	
	@Test
	public void testThatObjectMapperCanCreateJavaObjectFromJsonObject() throws JsonMappingException, JsonProcessingException {
		String apiBuku1 = "{\"fooBuzz\":\"Buzzfeez\",\"nib\":\"122-123-123-123\",\"nama\":\"Unity in Motion\",\"penulis\":\"Sutomo\",\"tahun\":\"2022\"}";
		Buku buku = Buku.builder()
				.nib("122-123-123-123")
				.nama("Unity in Motion")
				.penulis("Sutomo")
				.tahunTerbit("2022")
				.build();
		final ObjectMapper objectMapper = new ObjectMapper();
		
		Buku bukuAmbil = objectMapper.readValue(apiBuku1, Buku.class);
		
		assertThat(bukuAmbil).isEqualTo(buku);
		
	}
}
