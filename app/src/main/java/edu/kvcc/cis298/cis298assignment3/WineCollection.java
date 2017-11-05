package edu.kvcc.cis298.cis298assignment3;
import java.util.ArrayList;

/**
 * Created by kyleg on 10/28/2017.
 */

public class WineCollection  {

    private ArrayList<WineItem> mWineList;

    public WineCollection() {

        mWineList = new ArrayList<>();

    }

    public void AddWineItem(String id, String pack, String name, String size, Boolean active) {
        mWineList.add(new WineItem(id, pack, name, size, active));

    }
}
