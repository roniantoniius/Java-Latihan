package com.roniantonius.databasepostgre.mappers.impl;

import org.springframework.stereotype.Component;

import com.roniantonius.databasepostgre.domain.dto.KapalDto;
import com.roniantonius.databasepostgre.domain.entities.KapalEntity;
import com.roniantonius.databasepostgre.domain.entities.PpnEntity;
import com.roniantonius.databasepostgre.mappers.Mapper;
import com.roniantonius.databasepostgre.repositories.PpnRepository;

@Component
public class KapalMapperImpl implements Mapper<KapalEntity, KapalDto> {
    private PpnRepository ppnRepository;
    
    public KapalMapperImpl(PpnRepository ppnRepository) {
        this.ppnRepository = ppnRepository;
    }
    
    @Override
    public KapalDto mapTo(KapalEntity kapalEntity) {
        if (kapalEntity == null) {
            return null;
        }
        
        KapalDto kapalDto = new KapalDto();
        kapalDto.setIdkapal(kapalEntity.getIdkapal());
        kapalDto.setNamekapal(kapalEntity.getNamekapal());
        kapalDto.setUkuran(kapalEntity.getUkuran());
        
        // Extract the ID from PpnEntity
        if (kapalEntity.getPpnid() != null) {
            kapalDto.setPpnid(kapalEntity.getPpnid().getId());
        }
        
        return kapalDto;
    }
    
    @Override
    public KapalEntity mapFrom(KapalDto kapalDto) {
        if (kapalDto == null) {
            return null;
        }
        
        KapalEntity kapalEntity = new KapalEntity();
        kapalEntity.setIdkapal(kapalDto.getIdkapal());
        kapalEntity.setNamekapal(kapalDto.getNamekapal());
        kapalEntity.setUkuran(kapalDto.getUkuran());
        
        // Look up PpnEntity by ID
        if (kapalDto.getPpnid() != null) {
            PpnEntity ppnEntity = ppnRepository.findById(kapalDto.getPpnid())
                .orElse(null);
            kapalEntity.setPpnid(ppnEntity);
        }
        
        return kapalEntity;
    }
}