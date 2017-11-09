package edu.kvcc.cis298.cis298assignment3;

import android.support.v4.app.Fragment;

public class WineActivity extends SingleFragmentActivity {

    public CSVReader mWineListCSV;
    //public WineShop mWineCollection;

    @Override
    protected Fragment createFragment() {

        //mWineCollection = new WineItem();
        mWineListCSV = new CSVReader(this);

        return new WineFragment();

    }
}
