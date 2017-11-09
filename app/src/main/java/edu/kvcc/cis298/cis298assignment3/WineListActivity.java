package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by kyleg on 11/9/2017.
 */

public class WineListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {

        return new WineListFragment();

    }
}
