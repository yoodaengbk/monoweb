package com.mono.core.dto;



public class CommentDTO {
    private Integer commentId;
    private String content;
    private String createdDate;
    private UserDTO userDTO;
    private TourDTO tourDTO;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
