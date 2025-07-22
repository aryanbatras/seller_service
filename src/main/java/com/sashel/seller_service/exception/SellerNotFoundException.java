package com.sashel.seller_service.exception;

public class SellerNotFoundException extends RuntimeException{
    public SellerNotFoundException(Long sellerId) {
        super("Seller " + sellerId + " Not Found");
    }
}
