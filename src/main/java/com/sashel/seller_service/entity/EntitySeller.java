package com.sashel.seller_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "seller_service")
public class EntitySeller {

    public EntitySeller(){}
    public EntitySeller(Long Id){
        sellerId = Id;
    }

    @Id
    private Long sellerId;
    private String businessName;
    private String businessAddress;
    private String businessDescription;
    private String businessLogo;
    private Boolean kycVerified;
    private String bestSellingSKU;
    private String profileImage;
    private Integer totalReviews;
    private Float avgRating;

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

    public Boolean getKycVerified() {
        return kycVerified;
    }

    public String getBestSellingSKU() {
        return bestSellingSKU;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public Integer getTotalReviews() {
        return totalReviews;
    }

    public Float getAvgRating() {
        return avgRating;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }

    public void setBusinessLogo(String businessLogo) {
        this.businessLogo = businessLogo;
    }

    public void setKycVerified(Boolean kycVerified) {
        this.kycVerified = kycVerified;
    }

    public void setBestSellingSKU(String bestSellingSKU) {
        this.bestSellingSKU = bestSellingSKU;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void setTotalReviews(Integer totalReviews) {
        this.totalReviews = totalReviews;
    }

    public void setAvgRating(Float avgRating) {
        this.avgRating = avgRating;
    }
}
