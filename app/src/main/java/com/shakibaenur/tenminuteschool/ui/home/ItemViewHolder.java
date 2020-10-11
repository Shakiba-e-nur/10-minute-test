package com.shakibaenur.tenminuteschool.ui.home;

import android.view.View;
import android.widget.TextView;

import com.shakibaenur.tenminuteschool.R;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class ItemViewHolder extends GroupViewHolder {
    private TextView itemTitle;
    public ItemViewHolder(View itemView) {
        super(itemView);
        itemTitle=itemView.findViewById(R.id.text_view_item);
    }
    public String getItemTitle()
    {
        return itemTitle.getText().toString();
    }
    public void setItemTitle(ExpandableGroup group) {
        itemTitle.setText(group.getTitle());
    }
}
