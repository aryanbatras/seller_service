package com.sashel.seller_service.controller;

import com.sashel.seller_service.dto.DTOSellerRequest;
import com.sashel.seller_service.dto.DTOSellerResponse;
import com.sashel.seller_service.dto.DTOUserIdRequest;
import com.sashel.seller_service.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;


@RestController
public class ControllerMappedSeller {

    @Autowired
    private SellerService sellerService;

    @PostMapping("/seller")
    public ResponseEntity<DTOSellerResponse> onboardSeller(@RequestBody DTOUserIdRequest userIdJson){
        return ResponseEntity.ok(
                sellerService.onboardSeller(userIdJson)
        );
    }

    @GetMapping("/seller/{sellerId}")
    public ResponseEntity<DTOSellerResponse> getSeller(@PathVariable Long sellerId){
        return ResponseEntity.ok(
                sellerService.getSellerById(sellerId)
        );
    }

    @PutMapping("/seller/{sellerId}")
    public ResponseEntity<DTOSellerResponse> updateSeller(
            @PathVariable Long sellerId,
            @RequestBody DTOSellerRequest jsonBody
            ){
        return ResponseEntity.ok(
                sellerService.updateSeller(
                        sellerId,
                        jsonBody
                )
        );
    }
}