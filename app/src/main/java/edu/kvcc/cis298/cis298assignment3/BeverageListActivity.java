package edu.kvcc.cis298.cis298assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeverageListActivity extends AppCompatActivity {

    public CSVReader mWineListCSV;
    public WineCollection mWineCollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage_list);

        mWineCollection = new WineCollection();
        mWineListCSV = new CSVReader(this, mWineCollection);

    }
}
