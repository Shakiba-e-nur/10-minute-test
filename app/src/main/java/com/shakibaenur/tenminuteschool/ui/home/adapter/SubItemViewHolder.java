package com.shakibaenur.tenminuteschool.ui.home.adapter;

import android.view.View;
import android.widget.TextView;
import com.shakibaenur.tenminuteschool.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class SubItemViewHolder extends ChildViewHolder {
    private TextView subItemTitle;
    public SubItemViewHolder(View itemView) {
        super(itemView);
        subItemTitle = itemView.findViewById(R.id.text_view_sub_item);
    }
    public void setSubItemTitle(SubItem item) {
        subItemTitle.setText(item.getTitle());
    }
}
