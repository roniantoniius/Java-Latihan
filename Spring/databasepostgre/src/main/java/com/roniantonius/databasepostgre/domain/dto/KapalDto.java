package com.roniantonius.databasepostgre.domain.dto;


import com.roniantonius.databasepostgre.domain.entities.PpnEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KapalDto {
	private Long idkapal;
	private String namekapal;
	private Integer ukuran;
	private Long ppnid;
}
