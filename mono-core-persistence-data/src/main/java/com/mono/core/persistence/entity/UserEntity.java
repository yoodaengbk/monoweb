package com.mono.core.persistence.entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;



    @ManyToOne
    @JoinColumn(name = "roleid")
    private RoleEntity roleEntity;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<CommentEntity> commentList;

    @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
    private List<CartEntity> cartList;



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    public List<CommentEntity> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentEntity> commentList) {
        this.commentList = commentList;
    }

    public List<CartEntity> getCartList() {
        return cartList;
    }

    public void setCartList(List<CartEntity> cartList) {
        this.cartList = cartList;
    }
}
