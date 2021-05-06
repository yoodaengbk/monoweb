package com.mono.core.dto;



public class CartDTO {
    private Integer cartId;
    private String createdDate;
    private UserDTO userDTO;
    private TourDTO tourDTO;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public TourDTO getTourDTO() {
        return tourDTO;
    }

    public void setTourDTO(TourDTO tourDTO) {
        this.tourDTO = tourDTO;
    }
}
