package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kyleg on 10/23/2017.
 */

public class CSVReader {

    private ArrayList<String> mWineList;
    private Context mContext;
    private String mFileLine;

    private String mProdId;
    private String mProdName;
    private String mProdSize;
    private String mProdPack;
    private String mIsInUse;


    public CSVReader(Context context) {

        mContext = context;
        ReadCSV(context);
    }

    public String getProdId() {
        return mProdId;
    }

    public String getProdName() {
        return mProdName;
    }

    public String getProdSize() {
        return mProdSize;
    }

    public String getProdPack() {
        return mProdPack;
    }

    public String getIsInUse() {
        return mIsInUse;
    }

    public ArrayList<String> ReadCSV(Context context) {

        int i = 0;
        ArrayList<String> mWineList = new ArrayList<>();
        InputStream csvFile = context.getResources().openRawResource(R.raw.beverage_list);
        Scanner listReader = new Scanner(csvFile);
        while (listReader.hasNextLine()) {
            mWineList.add(listReader.nextLine());
            i++;
        }
        return mWineList;
    }

}
