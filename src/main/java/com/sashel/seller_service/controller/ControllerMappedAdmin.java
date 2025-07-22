package com.sashel.seller_service.controller;

import com.sashel.seller_service.entity.EntitySeller;
import com.sashel.seller_service.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ControllerMappedAdmin {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/admin/sellers")
    public ResponseEntity<List<EntitySeller>> geAllSellers(){
        return ResponseEntity.ok(
                sellerService.getAllSellers()
        );
    }

}