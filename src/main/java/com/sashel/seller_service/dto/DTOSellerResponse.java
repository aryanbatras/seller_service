package com.sashel.seller_service.dto;

public class DTOSellerResponse {

    private Long sellerId;
    private String businessName;
    private String businessAddress;
    private String businessDescription;
    private String businessLogo;
    private String profileImage;
    private Boolean kycVerified;
    private String bestSellingSKU;
    private Integer totalReviews;
    private Float avgRating;

    public DTOSellerResponse(){}

    public DTOSellerResponse(
            Long sellerId,
            String businessName,
            String businessAddress,
            String businessDescription,
            String businessLogo,
            String profileImage,
            Boolean kycVerified,
            String bestSellingSKU,
            Integer totalReviews,
            Float avgRating
    ) {
        this.sellerId = sellerId;
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessDescription = businessDescription;
        this.businessLogo = businessLogo;
        this.profileImage = profileImage;
        this.kycVerified = kycVerified;
        this.bestSellingSKU = bestSellingSKU;
        this.totalReviews = totalReviews;
        this.avgRating = avgRating;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public String getBusinessDescription() {
        return businessDescription;
    }

    public String getBusinessLogo() {
        return businessLogo;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public Boolean getKycVerified() {
        return kycVerified;
    }

    public String getBestSellingSKU() {
        return bestSellingSKU;
    }

    public Integer getTotalReviews() {
        return totalReviews;
    }

    public Float getAvgRating() {
        return avgRating;
    }
}
