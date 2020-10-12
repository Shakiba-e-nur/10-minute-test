package com.shakibaenur.tenminuteschool.ui.home;

import android.content.Intent;

import com.shakibaenur.tenminuteschool.R;
import com.shakibaenur.tenminuteschool.databinding.ActivityHomeBinding;
import com.shakibaenur.tenminuteschool.ui.document.DocumentActivity;
import com.shakibaenur.tenminuteschool.ui.video.VideoActivity;
import com.shakibaenur.tenminuteschool.util.AppConstants;
import com.shakibaenur.tenminuteschool.util.base.BaseActivity;

public class HomeActivity extends BaseActivity {

    HomeViewModel homeViewModel;
    private ActivityHomeBinding mBinding;
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
        homeViewModel= (HomeViewModel)getViewModel(HomeViewModel.class);
        mBinding.setHomeViewModel(homeViewModel);
        homeViewModel.initModel();
        setObservers();
    }

    private void setObservers() {
        homeViewModel.actionPerformedLiveData.observe(this,typeAction -> {
            if(typeAction== AppConstants.TypeAction.ACTION_VIDEO)
            {
               startActivity(new Intent(this, VideoActivity.class));
            }
            else if(typeAction== AppConstants.TypeAction.ACTION_DOCUMENT)
            {
               startActivity(new Intent(this, DocumentActivity.class));
            }
        });
    }




}