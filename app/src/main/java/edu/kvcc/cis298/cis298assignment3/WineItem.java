package edu.kvcc.cis298.cis298assignment3;
import java.util.UUID;

/**
 * Created by kyleg on 10/29/2017.
 */

public class WineItem {

    private String mId;
    private String mName;
    private String mPack;
    private String mPrice;
    private boolean mIsActive;

    public WineItem(String id, String name, String pack, String price, Boolean active){
        this.mId = id;
        this.mName = name;
        this.mPack = pack;
        this.mPrice = price;
        this.mIsActive = active;

    }
}
