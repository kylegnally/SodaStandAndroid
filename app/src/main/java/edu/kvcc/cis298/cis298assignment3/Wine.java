package edu.kvcc.cis298.cis298assignment3;

import java.util.UUID;

/**
 * Created by kyleg on 10/28/2017.
 */

public class Wine {

    private UUID mId;
    private String mProductName;
    private String mProductId;
    private String mProductPrice;

    public Wine() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
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
