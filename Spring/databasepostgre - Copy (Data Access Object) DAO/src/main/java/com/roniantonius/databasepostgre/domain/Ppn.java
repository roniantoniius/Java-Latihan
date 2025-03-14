package com.roniantonius.databasepostgre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // ambil setter getternya
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ppn {
	private Long id;
	private String name;
	private String lokasi;
}
