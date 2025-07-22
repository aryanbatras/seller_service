package com.sashel.seller_service.mapper;

import com.sashel.seller_service.dto.DTOSellerRequest;
import com.sashel.seller_service.dto.DTOSellerResponse;
import com.sashel.seller_service.dto.DTOUserIdRequest;
import com.sashel.seller_service.entity.EntitySeller;

public class SellerMapper {

    public static DTOSellerResponse mapEntitySellerToDTOResponseSeller(EntitySeller e) {
        return new DTOSellerResponse(
                e.getSellerId(),
                e.getBusinessName(),
                e.getBusinessAddress(),
                e.getBusinessDescription(),
                e.getBusinessLogo(),
                e.getProfileImage(),
                e.getKycVerified(),
                e.getBestSellingSKU(),
                e.getTotalReviews(),
                e.getAvgRating()
        );
    }

    public static EntitySeller mapEntitySellerFromDTORequestSeller(EntitySeller e, DTOSellerRequest d){
        if (d.getBusinessName() != null) e.setBusinessName(d.getBusinessName());
        if (d.getBusinessAddress() != null) e.setBusinessAddress(d.getBusinessAddress());
        if (d.getBusinessDescription() != null) e.setBusinessDescription(d.getBusinessDescription());
        if (d.getBusinessLogo() != null) e.setBusinessLogo(d.getBusinessLogo());
        if (d.getProfileImage() != null) e.setProfileImage(d.getProfileImage());
        return e;
    }


    public static EntitySeller mapEntitySellerFromDTOUserIdRequest(EntitySeller e, DTOUserIdRequest d){
        if (d.getUserId() != null) e.setSellerId(d.getUserId());
        return e;
    }

}
