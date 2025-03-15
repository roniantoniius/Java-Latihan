package com.roniantonius.databasepostgre.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "kapal")
public class KapalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kapal_id_seq") // kalau string adalah primary, cukup anotasi Id saja
	@SequenceGenerator(name = "kapal_id_seq", sequenceName = "kapal_id_seq", allocationSize = 1)
	private Long idkapal;
	private String namekapal;
	private Integer ukuran;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ppn_id")
	private PpnEntity ppnid;
}
