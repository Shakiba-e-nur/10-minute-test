package com.shakibaenur.tenminuteschool.ui.home;

import com.shakibaenur.tenminuteschool.ui.model.SubItem;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ListItem extends ExpandableGroup<SubItem> {
    public ListItem(String title, List<SubItem> items) {
        super(title, items);
    }
}
