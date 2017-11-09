package edu.kvcc.cis298.cis298assignment3;
import android.content.Context;
import android.content.res.Resources;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by kyleg on 10/23/2017.
 */

public class CSVReader {

    private WineShop mWineCollection;
    private Context mContext;


    public CSVReader(Context context) {

        mContext = context;
        // mWineCollection = collection;
        ReadCSV(mContext);

    }

    private void ReadCSV(Context context) {

        InputStream csvFile = context.getResources().openRawResource(R.raw.beverage_list);
        Scanner listReader = new Scanner(csvFile);
        String wineLine;
        while (listReader.hasNextLine()) {
            wineLine = listReader.nextLine();
            if (!(wineLine.contentEquals(""))) {
                this.ProcessOneLine(wineLine);
            }
        }
    }

    private void ProcessOneLine(String line) {
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

        mWineCollection.AddWineItem(id, name, pack, price, active);

    }
}
