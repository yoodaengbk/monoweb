package com.mono.core.dto;


import java.util.List;

public class UserDTO {
    private Integer userId;
    private String name;
    private String password;
    private String phone;
    private RoleDTO roleDTO;
    private List<CommentDTO> commentList;
    private List<CartDTO> cartList;

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

    public RoleDTO getRoleDTO() {
        return roleDTO;
    }

    public void setRoleDTO(RoleDTO roleDTO) {
        this.roleDTO = roleDTO;
    }

    public List<CommentDTO> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentDTO> commentList) {
        this.commentList = commentList;
    }

    public List<CartDTO> getCartList() {
        return cartList;
    }

    public void setCartList(List<CartDTO> cartList) {
        this.cartList = cartList;
    }
}
