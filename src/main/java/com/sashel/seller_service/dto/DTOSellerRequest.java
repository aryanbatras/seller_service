package com.sashel.seller_service.dto;

public class DTOSellerRequest {

    private String businessName;
    private String businessAddress;
    private String businessDescription;
    private String businessLogo;
    private String profileImage;

    public DTOSellerRequest(){}
    public DTOSellerRequest(
            String businessName,
            String businessAddress,
            String businessDescription,
            String businessLogo,
            String profileImage
    ) {
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessDescription = businessDescription;
        this.businessLogo = businessLogo;
        this.profileImage = profileImage;
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
}
