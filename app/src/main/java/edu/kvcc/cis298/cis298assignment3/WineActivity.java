package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;
import android.support.v4.app.Fragment;

public class WineActivity extends SingleFragmentActivity {

    public static final String EXTRA_WINE_ID = "edu.kvcc.cis298.cis298assignment3.wine_id";

    public CSVReader mWineListCSV;

    @Override
    protected Fragment createFragment() {

        //mWineCollection = new WineItem();
        mWineListCSV = new CSVReader(this);

        return new WineFragment();

    }
}
