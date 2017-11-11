//package edu.kvcc.cis298.cis298assignment3;
//
//import android.content.Context;
//import android.content.Intent;
//import android.support.v4.app.Fragment;
//
//public class WineActivity extends SingleFragmentActivity {
//
//    private static final String EXTRA_WINE_ID = "edu.kvcc.cis298.cis298assignment3.wine_id";
//
//    public CSVReader mWineListCSV;
//
//    public static Intent newIntent(Context packageContext, String wineId) {
//        Intent intent = new Intent(packageContext, WineActivity.class);
//        intent.putExtra(EXTRA_WINE_ID, wineId);
//        return intent;
//    }
//
//    @Override
//    protected Fragment createFragment() {
//
//        mWineListCSV = new CSVReader(this);
//
//        String wineId = (String) getIntent().getSerializableExtra(EXTRA_WINE_ID);
//        return WineFragment.newInstance(wineId);
//
//        // return new WineFragment();
//
//    }
//}
