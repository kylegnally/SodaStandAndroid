package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyleg on 11/7/2017.
 */

public class WineShop {

     private static WineShop sWineShop;
     private ArrayList<WineItem> mWines;

     public static WineShop get (Context context) {

         if (sWineShop == null) {
             sWineShop = new WineShop(context);
         }

         return sWineShop;

     }

     private WineShop(Context context) {
         mWines = new ArrayList<>();
     }


     public void addWineItem(String id, String name, String pack, String price, Boolean active) {
         mWines.add(new WineItem(id, name, pack, price, active));
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
