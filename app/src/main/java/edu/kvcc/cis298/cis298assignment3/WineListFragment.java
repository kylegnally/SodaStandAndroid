package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/**
 * Created by kyleg on 11/9/2017.
 */

public class WineListFragment extends Fragment {

    private RecyclerView mWineRecyclerView;
    private WineAdapter mAdapter;
    private WineShop mWineList;
    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wine_list, container, false);

        mWineRecyclerView = (RecyclerView) view.findViewById(R.id.wine_recycler_view);
        mWineRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mWineList = WineShop.get(mContext);

        updateUI();
        return view;
    }

    public void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI() {

        WineShop wineShop = WineShop.get(getActivity());
        List<WineItem> wines = wineShop.getWines();

        if (mAdapter == null) {

            mAdapter = new WineAdapter(wines);
            mWineRecyclerView.setAdapter(mAdapter);

        } else {

            mAdapter.notifyDataSetChanged();
        }

    }

    // this is our ViewHolder. It expects a TextView and references that view
    private class WineHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private WineItem mWine;

        private TextView mTitleTextView;
        private TextView mIdTextView;
        private TextView mPriceTextView;

        public WineHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            mTitleTextView = (TextView) itemView.findViewById(R.id.list_item_wine_title_text_view);
            mIdTextView = (TextView) itemView.findViewById(R.id.list_item_wine_id_text_view);
            mPriceTextView = (TextView) itemView.findViewById(R.id.list_item_wine_price_text_view);

        }

        public void bindWine(WineItem wine) {
            mWine = wine;
            mTitleTextView.setText(mWine.getName());
            mIdTextView.setText(mWine.getId());
            mPriceTextView.setText(mWine.getPrice());
        }

        @Override
        public void onClick(View v) {
            //Intent intent = new Intent(getActivity(), WineActivity.class);
            Intent intent = WinePagerActivity.newIntent(getActivity(), mWine.getId());
            startActivity(intent);
        }
    }

    private class WineAdapter extends RecyclerView.Adapter<WineHolder> {

        private List<WineItem> mWines;

        public WineAdapter(List<WineItem> wine) {

            mWines = wine;

        }

        @Override
        public WineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_wine, parent, false);
            return new WineHolder(view);
        }

        @Override
        public void onBindViewHolder(WineHolder holder, int position) {
            WineItem wine = mWines.get(position);
            holder.bindWine(wine);
        }

        @Override
        public int getItemCount() {
            return mWines.size();
        }

    }
}
