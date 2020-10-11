package com.shakibaenur.tenminuteschool.ui.home;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shakibaenur.tenminuteschool.R;
import com.shakibaenur.tenminuteschool.ui.document.DocumentActivity;
import com.shakibaenur.tenminuteschool.ui.model.SubItem;
import com.shakibaenur.tenminuteschool.ui.video.VideoActivity;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.listeners.OnGroupClickListener;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class HomeAdapter extends ExpandableRecyclerViewAdapter<ItemViewHolder, SubItemViewHolder> {
    private LayoutInflater mInflater;
    Context context;
    int position=0;
    public HomeAdapter(Context context,List<? extends ExpandableGroup> groups) {
        super(groups);
        this.context=context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ItemViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_list, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public SubItemViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.sub_item_list, parent, false);
        return new SubItemViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(SubItemViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final SubItem item = ((ListItem) group).getItems().get(childIndex);
        holder.setSubItemTitle(item);

    }

    @Override
    public void onBindGroupViewHolder(ItemViewHolder holder, int flatPosition, ExpandableGroup group) {

        holder.setItemTitle(group);
        if(holder.getItemTitle().equals(context.getString(R.string.video_3_0)))
        {
            holder.setOnGroupClickListener(new OnGroupClickListener() {
                @Override
                public boolean onGroupClick(int flatPos) {
                    context.startActivity(new Intent(context,VideoActivity.class));
                    return false;
                }
            });
        }
        if(holder.getItemTitle().equals(context.getString(R.string.document_4_0)))
        {
            holder.setOnGroupClickListener(new OnGroupClickListener() {
                @Override
                public boolean onGroupClick(int flatPos) {
                    context.startActivity(new Intent(context, DocumentActivity.class));
                    return false;
                }
            });
        }
        if(holder.getItemTitle().equals(context.getString(R.string.audio_5)))
        {
            holder.setOnGroupClickListener(new OnGroupClickListener() {
                @Override
                public boolean onGroupClick(int flatPos) {
                    Toast.makeText(context,"Audio",Toast.LENGTH_SHORT).show();
                    return false;
                }
            });
        }
    }
}
