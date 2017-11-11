package edu.kvcc.cis298.cis298assignment3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by kyleg on 11/6/2017.
 */

public class WineFragment extends Fragment {

    private WineItem mWine;
    private TextView mProductName;
    private TextView mProductId;
    private TextView mProductPrice;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String wineId = (String) getActivity().getIntent().getSerializableExtra(WineActivity.EXTRA_WINE_ID);
        mWine = WineShop.get(getActivity()).getWine(wineId);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_wine, container, false);

        mProductName = (TextView) v.findViewById(R.id.wine_name);
        mProductName.setText(mWine.getName());
        mProductName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                mWine.setName(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mProductId = (TextView) v.findViewById(R.id.wine_id);
        mProductId.setText(mWine.getId());
        mProductId.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                mWine.setId(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mProductPrice = (TextView) v.findViewById(R.id.wine_price);
        mProductPrice.setText(mWine.getPrice());
        mProductPrice.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                mWine.setPrice(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return v;
    }
}
