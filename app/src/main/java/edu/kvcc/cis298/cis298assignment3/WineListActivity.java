package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by kyleg on 11/9/2017.
 */

public class WineListActivity extends SingleFragmentActivity {

    private CSVReader mReader;
    private WineShop mWineShop;

    @Override
    protected Fragment createFragment() {

        mReader = new CSVReader(this, mWineShop);
        return new WineListFragment();

    }
}
