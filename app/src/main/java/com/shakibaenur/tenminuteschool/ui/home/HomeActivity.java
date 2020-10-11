package com.shakibaenur.tenminuteschool.ui.home;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shakibaenur.tenminuteschool.R;
import com.shakibaenur.tenminuteschool.databinding.ActivityHomeBinding;
import com.shakibaenur.tenminuteschool.ui.model.SubItem;
import com.shakibaenur.tenminuteschool.util.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {
    ActivityHomeBinding mBinding;
    HomeAdapter mhomeAdapter;
    RecyclerView recyclerView;
    @Override
    public int setLayoutId() {
        return R.layout.activity_home;
    }
    @Override
    public int setDefaultTheme()
    {
        return R.style.AppTheme;
    }
    @Override
    public void startUI() {
        mBinding = (ActivityHomeBinding) getViewDataBinding();
        recyclerView=findViewById(R.id.recycle_item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ListItem> items=new ArrayList<>();
        List<SubItem> chapter1_subItem=new ArrayList<>();
        chapter1_subItem.add(new SubItem(getString(R.string.video_1_1)));
        chapter1_subItem.add(new SubItem(getString(R.string.document_1_1)));
        chapter1_subItem.add(new SubItem(getString(R.string.video_1_2)));

        ListItem chapter1=new ListItem(getString(R.string.chapter_1),chapter1_subItem);
        items.add(chapter1);
        List<SubItem> chapter2_subItem=new ArrayList<>();
        chapter2_subItem.add(new SubItem(getString(R.string.document_2_1)));
        chapter2_subItem.add(new SubItem(getString(R.string.video_2_1)));
        chapter2_subItem.add(new SubItem(getString(R.string.video_2_2)));
        chapter2_subItem.add(new SubItem(getString(R.string.audio_2_1)));
        ListItem chapter2=new ListItem(getString(R.string.chapter_2),chapter2_subItem);
        items.add(chapter2);

        List<SubItem> video3_subItem=new ArrayList<>();
        ListItem video_3=new ListItem(getString(R.string.video_3_0),video3_subItem);
        items.add(video_3);

        List<SubItem> document_4_subItem=new ArrayList<>();
        ListItem document_4=new ListItem(getString(R.string.document_4_0),document_4_subItem);
        items.add(document_4);

        List<SubItem> audio_5_subItem=new ArrayList<>();
        ListItem audio_5=new ListItem(getString(R.string.audio_5),audio_5_subItem);
        items.add(audio_5);

        mhomeAdapter=new HomeAdapter(this,items);
        recyclerView.setAdapter(mhomeAdapter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mhomeAdapter.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mhomeAdapter.onRestoreInstanceState(savedInstanceState);
    }


}