package edu.kvcc.cis298.cis298assignment3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

public class WineActivity extends FragmentActivity {

    public CSVReader mWineListCSV;
    public WineCollection mWineCollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new WineFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        mWineCollection = new WineCollection();
        mWineListCSV = new CSVReader(this, mWineCollection);

    }
}
