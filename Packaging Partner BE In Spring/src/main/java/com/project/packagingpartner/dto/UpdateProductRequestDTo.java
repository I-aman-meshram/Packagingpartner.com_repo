package com.project.packagingpartner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UpdateProductRequestDTo {
    public Long productID;
    public String productName;
    public String productType;
    public String productPrice;
    public String productDetails;
    public String productCompany;
    public Long quantity;
}
