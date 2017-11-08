package edu.kvcc.cis298.cis298assignment3;

import java.util.UUID;

/**
 * Created by kyleg on 10/28/2017.
 */

public class Wine {

    // This class isn't necessary. Use the WintItem clas for everything in here.
    // UUID isn't necessary.

    private UUID mId;
    private String mProductName;
    private String mProductId;
    private String mProductPack;
    private Boolean mProductActive;
    private String mProductPrice;

    public Wine() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getProductPack() {
        return mProductPack;
    }

    public void setProductPack(String productPack) {
        mProductPack = productPack;
    }

    public Boolean getProductActive() {
        return mProductActive;
    }

    public void setProductActive(Boolean productActive) {
        mProductActive = productActive;
    }

    public String getProductName() {
        return mProductName;
    }

    public void setProductName(String productName) {
        mProductName = productName;
    }

    public String getProductId() {
        return mProductId;
    }

    public void setProductId(String productId) {
        mProductId = productId;
    }

    public String getProductPrice() {
        return mProductPrice;
    }

    public void setProductPrice(String productPrice) {
        mProductPrice = productPrice;
    }
}
