package com.shakibaenur.tenminuteschool.util;

import android.content.Context;

import com.shakibaenur.tenminuteschool.R;
import com.shakibaenur.tenminuteschool.ui.home.adapter.SubItem;

import java.util.ArrayList;
import java.util.List;

public class AppConstants {
    public static List<SubItem>  GetChapter1SubItem(Context context){
        List<SubItem> chapter1_subItem=new ArrayList<>();
        chapter1_subItem.add(new SubItem(context.getString(R.string.video_1_1)));
        chapter1_subItem.add(new SubItem(context.getString(R.string.document_1_1)));
        chapter1_subItem.add(new SubItem(context.getString(R.string.video_1_2)));
        return chapter1_subItem;
    }
    public static List<SubItem> GetChapter2SubItem(Context context)
    {
        List<SubItem> chapter2_subItem=new ArrayList<>();
        chapter2_subItem.add(new SubItem(context.getString(R.string.document_2_1)));
        chapter2_subItem.add(new SubItem(context.getString(R.string.video_2_1)));
        chapter2_subItem.add(new SubItem(context.getString(R.string.video_2_2)));
        chapter2_subItem.add(new SubItem(context.getString(R.string.audio_2_1)));
        return chapter2_subItem;
    }

    public static interface TypeAction{
        public static final int ACTION_VIDEO=0;
        public static final int ACTION_DOCUMENT=1;
    }

}
