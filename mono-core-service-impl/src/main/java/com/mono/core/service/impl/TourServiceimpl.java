package com.mono.core.service.impl;

import com.mono.core.dao.TourDao;
import com.mono.core.daoimpl.TourDaoimpl;
import com.mono.core.dto.TourDTO;
import com.mono.core.persistence.entity.TourEntity;
import com.mono.core.service.TourService;
import com.mono.core.utils.TourBeanUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TourServiceimpl implements TourService {
    private final TourDao tourDao= new TourDaoimpl();
    public Object[] findTourByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit) {
        List<TourDTO> result = new ArrayList<TourDTO>();

        Object[] objects = tourDao.findByProperty(property, sortExpression, sortDirection, offset, limit);
        List<TourEntity> tourEntityList = (List<TourEntity>) objects[0];
        for(TourEntity tourEntity :tourEntityList){
            TourDTO dto = TourBeanUtil.entity2DTO(tourEntity);
            result.add(dto);
        }
        objects[0] = result;
        return objects;
    }
}
