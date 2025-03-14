package com.roniantonius.databasepostgre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kapal {
	private Long idkapal;
	private String namekapal;
	private String ukuran;
	private Long ppnid;
}
