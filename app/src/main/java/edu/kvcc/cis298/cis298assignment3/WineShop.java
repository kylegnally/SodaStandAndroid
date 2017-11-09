package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by kyleg on 11/7/2017.
 */

public class WineShop {

     private static WineShop sWineShop;
     private List<WineItem> mWines;
     private CSVReader mReader;
     private Context mContext;


     public static WineShop get (Context context) {

         if (sWineShop == null) {
             sWineShop = new WineShop(context);
         }

         return sWineShop;

     }

     private WineShop(Context context) {
         mWines = new ArrayList<>();
     }

    public void AddWineItem(String id, String pack, String name, String size, Boolean active) {
        mWines.add(new WineItem(id, pack, name, size, active));
    }

     public List<WineItem> getWines() {
         return mWines;
     }

     public WineItem getWine(String id) {
         for (WineItem wine : mWines) {
             if (wine.getId().equals(id)) {
                 return wine;
             }
         }
         return null;
     }

}
