package edu.kvcc.cis298.cis298assignment3;
import android.content.Context;
import android.content.res.Resources;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kyleg on 10/23/2017.
 */

public class CSVReader {

    //private WineShop mWineCollection;
    private Context mContext;
    private ArrayList<WineItem> mWine;


    public CSVReader(Context context) {

        mWine = new ArrayList<WineItem>();
        mContext = context;
        //mWineCollection = collection;
        ReadCSV(mContext, mWine);

    }

    private void ReadCSV(Context context, ArrayList wines) {

        InputStream csvFile = context.getResources().openRawResource(R.raw.beverage_list_trunc);
        Scanner listReader = new Scanner(csvFile);
        String wineLine;
        while (listReader.hasNextLine()) {
            wineLine = listReader.nextLine();
            if (!(wineLine.contentEquals(""))) {
                this.ProcessOneLine(wineLine, wines);
            }
        }
    }

    public void AddWineItem(String id, String pack, String name, String size, Boolean active) {
        mWine.add(new WineItem(id, pack, name, size, active));
    }



    private void ProcessOneLine(String line, ArrayList wines) {
        String parts[] = line.split(",");

        String id = parts[0];
        String name = parts[1];
        String pack =  parts[2];
        String price = parts[3];
        boolean active = false;
        if (parts[4].matches("True"))
        {
            active = true;
        }

        AddWineItem(id, name, pack, price, active);

    }
}
