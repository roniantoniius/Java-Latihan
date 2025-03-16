package com.roniantonius.databasepostgre;

import com.roniantonius.databasepostgre.domain.dto.KapalDto;
import com.roniantonius.databasepostgre.domain.dto.PpnDto;
import com.roniantonius.databasepostgre.domain.entities.KapalEntity;
import com.roniantonius.databasepostgre.domain.entities.PpnEntity;

public class TestDataUtil {
    private TestDataUtil() {
        
    }

    public static PpnEntity createTestPpnA() {
        return PpnEntity.builder()
                .name("karangantu")
                .lokasi("serang")
                .ppnYear(1990)
                .build();
    }
    
    public static PpnDto createTestPpnDtoA() {
        return PpnDto.builder()
                .name("karangantu")
                .lokasi("serang")
                .ppnYear(1990)
                .build();
    }
    
    public static PpnEntity createTestPpnB() {
        return PpnEntity.builder()
                .name("tangerang")
                .lokasi("banten")
                .ppnYear(1985)
                .build();
    }
    
    public static PpnDto createTestPpnDtoB() {
        return PpnDto.builder()
                .name("tangerang")
                .lokasi("banten")
                .ppnYear(1985)
                .build();
    }
    
    public static PpnEntity createTestPpnC() {
        return PpnEntity.builder()
                .name("kariimun")
                .lokasi("jawa")
                .ppnYear(2003)
                .build();
    }
    
    public static PpnDto createTestPpnDtoC() {
        return PpnDto.builder()
                .name("kariimun")
                .lokasi("jawa")
                .ppnYear(2003)
                .build();
    }

    public static KapalEntity createTestKapalA(final PpnEntity ppnEntity) {
        return KapalEntity.builder()
                .namekapal("Bintang")
                .ukuran(3)
                .ppnid(ppnEntity)
                .build();
    }
    
    public static KapalDto createTestKapalDtoA(final Long ppnEntity) {
        return KapalDto.builder()
                .namekapal("Bintang")
                .ukuran(3)
                .ppnid(ppnEntity)
                .build();
    }
    
    public static KapalEntity createTestKapalB(final PpnEntity ppnEntity) {
        return KapalEntity.builder()
                .namekapal("Matahari")
                .ukuran(14)
                .ppnid(ppnEntity)
                .build();
    }
    
    public static KapalDto createTestKapalDtoB(final Long ppnEntity) {
        return KapalDto.builder()
                .namekapal("Matahari")
                .ukuran(14)
                .ppnid(ppnEntity)
                .build();
    }
    
    public static KapalEntity createTestKapalC(final PpnEntity ppnEntity) {
        return KapalEntity.builder()
                .namekapal("Bulan")
                .ukuran(35)
                .ppnid(ppnEntity)
                .build();
    }
}