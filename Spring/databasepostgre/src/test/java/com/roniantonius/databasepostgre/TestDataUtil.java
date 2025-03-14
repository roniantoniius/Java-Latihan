package com.roniantonius.databasepostgre;

import com.roniantonius.databasepostgre.domain.Kapal;
import com.roniantonius.databasepostgre.domain.Ppn;

public class TestDataUtil {
    private TestDataUtil() {
        
    }

    public static Ppn createTestPpnA() {
        return Ppn.builder()
                .name("karangantu")
                .lokasi("serang")
                .ppnYear(1990)
                .build();
    }
    
    public static Ppn createTestPpnB() {
        return Ppn.builder()
                .name("tangerang")
                .lokasi("banten")
                .ppnYear(1985)
                .build();
    }
    
    public static Ppn createTestPpnC() {
        return Ppn.builder()
                .name("kariimun")
                .lokasi("jawa")
                .ppnYear(2003)
                .build();
    }

    public static Kapal createTestKapalA(final Ppn ppn) {
        return Kapal.builder()
                .namekapal("Bintang")
                .ukuran(3)
                .ppnid(ppn)
                .build();
    }
    
    public static Kapal createTestKapalB(final Ppn ppn) {
        return Kapal.builder()
                .namekapal("Matahari")
                .ukuran(14)
                .ppnid(ppn)
                .build();
    }
    
    public static Kapal createTestKapalC(final Ppn ppn) {
        return Kapal.builder()
                .namekapal("Bulan")
                .ukuran(35)
                .ppnid(ppn)
                .build();
    }
}