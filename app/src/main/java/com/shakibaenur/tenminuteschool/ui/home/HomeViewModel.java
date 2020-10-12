package com.shakibaenur.tenminuteschool.ui.home;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.shakibaenur.tenminuteschool.R;
import com.shakibaenur.tenminuteschool.ui.home.adapter.HomeAdapter;
import com.shakibaenur.tenminuteschool.ui.home.adapter.ListItem;
import com.shakibaenur.tenminuteschool.ui.home.adapter.SubItem;
import com.shakibaenur.tenminuteschool.util.AppConstants;
import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends AndroidViewModel implements HomeAdapter.HomeAdapterActionListener {
    public MutableLiveData<HomeModel> homeModelMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<Integer> actionPerformedLiveData = new MutableLiveData<>();

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }
    void initModel() {

        HomeModel homeViewModel = new HomeModel(getApplication(), getList(), this);
        homeModelMutableLiveData.postValue(homeViewModel);
    }

    private List<ListItem> getList() {
        List<ListItem> items = new ArrayList<>();
        ListItem chapter1 = new ListItem(getApplication().getString(R.string.chapter_1), AppConstants.GetChapter1SubItem(getApplication()));
        items.add(chapter1);
        ListItem chapter2 = new ListItem(getApplication().getString(R.string.chapter_2), AppConstants.GetChapter2SubItem(getApplication()));
        items.add(chapter2);
        List<SubItem> video3_subItem = new ArrayList<>();
        ListItem video_3 = new ListItem(getApplication().getString(R.string.video_3_0), video3_subItem);
        items.add(video_3);
        List<SubItem> document_4_subItem = new ArrayList<>();
        ListItem document_4 = new ListItem(getApplication().getString(R.string.document_4_0), document_4_subItem);
        items.add(document_4);
        List<SubItem> audio_5_subItem = new ArrayList<>();
        ListItem audio_5 = new ListItem(getApplication().getString(R.string.audio_5), audio_5_subItem);
        items.add(audio_5);
        return items;
    }

    @Override
    public void OnActionPerformed(int typeAction) {
        actionPerformedLiveData.postValue(typeAction);
    }
}
