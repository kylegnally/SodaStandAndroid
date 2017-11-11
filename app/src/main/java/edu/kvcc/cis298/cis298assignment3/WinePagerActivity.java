package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyleg on 11/11/2017.
 */

public class WinePagerActivity extends FragmentActivity {

    private static final String EXTRA_WINE_ID = "edu.kvcc.cis298.assignment3.wine_id";

    private ViewPager mViewPager;
    private List<WineItem> mWines;

    public static Intent newIntent(Context packageContext, String wineId) {
        Intent intent = new Intent(packageContext, WinePagerActivity.class);
        intent.putExtra(EXTRA_WINE_ID, wineId);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_pager);

        String wineId = (String) getIntent().getSerializableExtra(EXTRA_WINE_ID);

        mViewPager = (ViewPager) findViewById(R.id.activity_wine_pager_view_pager);

        mWines = WineShop.get(this).getWines();
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                WineItem wineItem = mWines.get(position);
                return WineFragment.newInstance(wineItem.getId());
            }

            @Override
            public int getCount() {
                return mWines.size();
            }
        });

        for (int i = 0; i < mWines.size(); i++) {
            if (mWines.get(i).getId().equals(wineId)) {
                mViewPager.setCurrentItem(i);
                break;

            }
        }
    }
}
