package com.mono.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;


    @Column(name = "createddate")
    private String createdDate;

    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "tourid")
    private TourEntity tourEntity;

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

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public TourEntity getTourEntity() {
        return tourEntity;
    }

    public void setTourEntity(TourEntity tourEntity) {
        this.tourEntity = tourEntity;
    }
}
