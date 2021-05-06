package com.mono.core.utils;

import com.mono.core.dto.CartDTO;
import com.mono.core.persistence.entity.CartEntity;

public class CartBeanUtil {
    public static CartDTO entity2Dto(CartEntity entity){
        CartDTO dto = new CartDTO();
        dto.setCartId(entity.getCartId());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setTourDTO(TourBeanUtil.entity2DTO(entity.getTourEntity()));
        dto.setUserDTO(UserBeanUtil.entity2DTO(entity.getUserEntity()));
        return dto;
    }
}
