package edu.kvcc.cis298.cis298assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class BeverageListActivity extends AppCompatActivity {

    public CSVReader mWineArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage_list);
        CSVReader mWineArray = new CSVReader(this);
        mWineArray.ReadCSV(this);
    }
}
