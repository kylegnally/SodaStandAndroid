package edu.kvcc.cis298.cis298assignment3;

import android.support.v4.app.Fragment;

/**
 * Created by kyleg on 11/9/2017.
 */

public class WineListActivity extends SingleFragmentActivity {

    private CSVReader mReader;

    @Override
    protected Fragment createFragment() {

        mReader = new CSVReader(this);
        return new WineListFragment();

    }
}
