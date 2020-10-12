package com.shakibaenur.tenminuteschool.ui.home;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shakibaenur.tenminuteschool.ui.home.adapter.HomeAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class HomeModel {
    private HomeAdapter homeAdapter;
    private RecyclerView.LayoutManager linearLayoutManager;
    private Context context;
    private List<? extends ExpandableGroup> groups;
    private HomeAdapter.HomeAdapterActionListener homeAdapterActionListener;

    public HomeModel(Context context, List<? extends ExpandableGroup> groups, HomeAdapter.HomeAdapterActionListener homeAdapterActionListener) {
        this.context = context;
        this.groups = groups;
        this.homeAdapterActionListener = homeAdapterActionListener;
    }
    public HomeAdapter getHomeAdapter() {
        if (homeAdapter == null) {
            homeAdapter = new HomeAdapter(context, groups,homeAdapterActionListener);
        }
        return homeAdapter;
    }
    public RecyclerView.LayoutManager getLinearLayoutManager() {
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(context);
        }
        return linearLayoutManager;
    }


}
