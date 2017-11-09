package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyleg on 11/9/2017.
 */

public class WineListFragment extends Fragment {

    private RecyclerView mWineRecyclerView;
    private WineAdapter mAdapter;
    private Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wine_list, container, false);

        mWineRecyclerView = (RecyclerView) view.findViewById(R.id.wine_recycler_view);
        mWineRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {

        WineShop wineShop = WineShop.get(getActivity());
        List<WineItem> wines = wineShop.getWines(mContext);

        mAdapter = new WineAdapter(wines);
        mWineRecyclerView.setAdapter(mAdapter);

    }

    // this is our ViewHolder. It expects a TextView and references that view
    private class WineHolder extends RecyclerView.ViewHolder {

        public TextView mTitleTextView;

        public WineHolder(View itemView) {
            super(itemView);

            mTitleTextView = (TextView) itemView;

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
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            return new WineHolder(view);
        }

        @Override
        public void onBindViewHolder(WineHolder holder, int position) {
            WineItem wine = mWines.get(position);
            holder.mTitleTextView.setText(wine.getName());
        }

        @Override
        public int getItemCount() {
            return mWines.size();
        }

    }
}
