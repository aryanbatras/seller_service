package com.sashel.seller_service.controller;

import com.sashel.seller_service.dto.DTOSellerRequest;
import com.sashel.seller_service.dto.DTOSellerResponse;
import com.sashel.seller_service.dto.DTOUserIdRequest;
import com.sashel.seller_service.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ControllerMappedBuyer {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/products/{sellerId}")
    public ResponseEntity<DTOSellerResponse> getSeller(@PathVariable Long sellerId){
        return ResponseEntity.ok(
                sellerService.getSellerById(sellerId)
        );
    }

}