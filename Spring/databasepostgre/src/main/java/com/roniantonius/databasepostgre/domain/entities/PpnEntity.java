package com.roniantonius.databasepostgre.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // ambil setter getternya
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ppn")
public class PpnEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ppn_id_seq")
	@SequenceGenerator(name = "ppn_id_seq", sequenceName = "ppn_id_seq", allocationSize = 1)
	private Long id;
	private String name;
	private String lokasi;
	@Column(name = "ppn_year")
    private Integer ppnYear;
	@Version
	private Long version;
}
