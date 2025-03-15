package com.roniantonius.databasepostgre.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PpnDto {
	private Long id;
	private String name;
	private String lokasi;
    private Integer ppnYear;
	private Long version;
}
