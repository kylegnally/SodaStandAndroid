package edu.kvcc.cis298.cis298assignment3;
import java.util.UUID;

/**
 * Created by kyleg on 10/29/2017.
 */

public class WineItem {

    // add getter and setter for these and use the getId() method here in the WineShop class

    private String mId;
    private String mName;
    private String mPack;
    private String mPrice;
    private boolean mIsActive;

    public WineItem(String id, String name, String pack, String price, Boolean active) {
        this.mId = id;
        this.mName = name;
        this.mPack = pack;
        this.mPrice = price;
        this.mIsActive = active;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPack() {
        return mPack;
    }

    public void setPack(String pack) {
        mPack = pack;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public boolean isActive() {
        return mIsActive;
    }

    public void setActive(boolean active) {
        mIsActive = active;
    }
}

