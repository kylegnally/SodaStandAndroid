package edu.kvcc.cis298.cis298assignment3;

import android.support.v4.app.Fragment;

/**
 * Created by kyleg on 11/9/2017.
 */

public class WineListActivity extends SingleFragmentActivity {

    // create a CSVReader object we will use to read the file
    private CSVReader mReader;

    @Override
    protected Fragment createFragment() {

        // instantiate the CSVReader, passing it the context it needs
        // to access the raw resource
        mReader = new CSVReader(this);

        // return a new WineListFragment
        return new WineListFragment();

    }
}
