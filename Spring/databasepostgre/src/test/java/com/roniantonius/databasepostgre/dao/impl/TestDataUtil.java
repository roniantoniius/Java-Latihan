package com.roniantonius.databasepostgre.dao.impl;

import com.roniantonius.databasepostgre.domain.Kapal;
import com.roniantonius.databasepostgre.domain.Ppn;

public class TestDataUtil {
	private TestDataUtil() {
		
	}

	public static Ppn createTestPpnA() {
		return Ppn.builder()
				.id(1L)
				.name("karangantu")
				.lokasi("serang")
				.build();
	}
	
	public static Ppn createTestPpnB() {
		return Ppn.builder()
				.id(2L)
				.name("tangerang")
				.lokasi("banten")
				.build();
	}
	
	public static Ppn createTestPpnC() {
		return Ppn.builder()
				.id(3L)
				.name("kariimun")
				.lokasi("jawa")
				.build();
	}

	public static Kapal createTestKapalA() {
		return Kapal.builder()
				.idkapal(1L)
				.namekapal("Bintang")
				.ukuran("3GT")
				.ppnid(1L)
				.build();
	}
	
	public static Kapal createTestKapalB() {
		return Kapal.builder()
				.idkapal(2L)
				.namekapal("Matahari")
				.ukuran("14GT")
				.ppnid(1L)
				.build();
	}
	
	public static Kapal createTestKapalC() {
		return Kapal.builder()
				.idkapal(3L)
				.namekapal("Bulan")
				.ukuran("35GT")
				.ppnid(1L)
				.build();
	}
	
}
