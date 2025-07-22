package com.sashel.seller_service.dto;

public class DTOUserIdRequest {

    public DTOUserIdRequest() {}
    public DTOUserIdRequest(Long userId) {
        this.userId = userId;
    }

    private Long userId;

    public Long getUserId() {
        return userId;
    }
}