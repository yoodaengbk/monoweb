package com.mono.core.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tour")
public class TourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tourId;

    @Column(name = "title")
    private String title;

    @Column(name = "destinations")
    private String destinations;

    @Column(name = "start")
    private String start;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "time")
    private Integer time;

    @Column(name = "content")
    private String content;

    @Column(name = "image")
    private String image;

    @OneToMany(mappedBy = "tourEntity",fetch = FetchType.LAZY)
    private List<CartEntity> cartList;


    @OneToMany(mappedBy = "tour",fetch = FetchType.LAZY)
    private List<CommentEntity> commentList;



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDestinations() {
        return destinations;
    }

    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
