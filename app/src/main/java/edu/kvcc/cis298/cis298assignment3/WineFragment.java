package edu.kvcc.cis298.cis298assignment3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by kyleg on 11/6/2017.
 */

public class WineFragment extends Fragment {

    private static final String ARG_WINE_ID = "wine_id";

    private WineItem mWine;

    public static WineFragment newInstance(String wineId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_WINE_ID, wineId);

        WineFragment fragment = new WineFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String wineId = (String) getArguments().getSerializable(ARG_WINE_ID);
        mWine = WineShop.get(getActivity()).getWine(wineId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_wine, container, false);

        EditText productName = (EditText) v.findViewById(R.id.wine_name);
        productName.setText(mWine.getName());
        productName.addTextChangedListener(new TextWatcher() {
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

        EditText productId = (EditText) v.findViewById(R.id.wine_id);
        productId.setText(mWine.getId());
        productId.addTextChangedListener(new TextWatcher() {
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

        EditText productPack = (EditText) v.findViewById(R.id.wine_pack);
        productPack.setText(mWine.getPack());
        productPack.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                mWine.setPack(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        EditText productPrice = (EditText) v.findViewById(R.id.wine_price);
        productPrice.setText(mWine.getPrice());
        productPrice.addTextChangedListener(new TextWatcher() {
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

        CheckBox productActive = (CheckBox) v.findViewById(R.id.wine_active);
        productActive.setChecked(mWine.isActive());
        productActive.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mWine.setActive(b);
            }
        });

        return v;
    }
}
