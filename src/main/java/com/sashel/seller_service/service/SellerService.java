package com.sashel.seller_service.service;

import com.sashel.seller_service.dto.DTOSellerRequest;
import com.sashel.seller_service.dto.DTOSellerResponse;
import com.sashel.seller_service.dto.DTOUserIdRequest;
import com.sashel.seller_service.entity.EntitySeller;
import com.sashel.seller_service.exception.SellerNotFoundException;
import com.sashel.seller_service.mapper.SellerMapper;
import com.sashel.seller_service.repo.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public DTOSellerResponse onboardSeller(DTOUserIdRequest body){
       return SellerMapper.mapEntitySellerToDTOResponseSeller(
               sellerRepository.findBySellerId(body.getUserId())
                       .orElseGet(() ->
                               sellerRepository.save(
                                       new EntitySeller(body.getUserId())
                               )
                       )
       );
    }

    public DTOSellerResponse getSellerById(Long sellerId){
        return SellerMapper.mapEntitySellerToDTOResponseSeller(
                sellerRepository.findBySellerId(sellerId)
                    .orElseThrow(() -> new SellerNotFoundException(sellerId))
        );
    }

    public DTOSellerResponse updateSeller(Long sellerId, DTOSellerRequest body){
        return SellerMapper.mapEntitySellerToDTOResponseSeller(
                sellerRepository.save(
                        SellerMapper.mapEntitySellerFromDTORequestSeller(
                                sellerRepository.findBySellerId(sellerId)
                                        .orElseThrow(() -> new SellerNotFoundException(sellerId)),
                                body
                        )
                )
        );
    }

    public List<EntitySeller> getAllSellers() {
        return sellerRepository.findAll();
    }
}
