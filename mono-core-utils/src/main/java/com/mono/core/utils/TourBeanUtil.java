package com.mono.core.utils;


import com.mono.core.dto.TourDTO;
import com.mono.core.persistence.entity.TourEntity;

public class TourBeanUtil {
    public static TourDTO entity2DTO(TourEntity entity){
        TourDTO dto = new TourDTO();
        dto.setContent(entity.getContent());
        dto.setTitle(entity.getTitle());
        dto.setCost(entity.getCost());
        dto.setTime(entity.getTime());
        dto.setStart(entity.getStart());
        dto.setDestinations(entity.getDestinations());

        return dto;
    }

    public static TourEntity dto2Entity(TourDTO dto){
        TourEntity entity = new TourEntity();
        entity.setContent(dto.getContent());
        entity.setTitle(dto.getTitle());
        entity.setCost(dto.getCost());
        entity.setTime(dto.getTime());
        entity.setStart(dto.getStart());
        entity.setDestinations(dto.getDestinations());
        return entity;
    }
}
