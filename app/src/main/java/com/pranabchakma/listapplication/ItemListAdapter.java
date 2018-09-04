package com.pranabchakma.listapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ItemListAdapter extends ArrayAdapter<Item> {

    public ItemListAdapter( Context context, List<Item> items) {
        super(context, 0,items);
    }
    public View getView(int position, View convertVew, ViewGroup parents){
        View listItemView = convertVew;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parents,false);
        }
        Item item = getItem(position);
        TextView title = listItemView.findViewById(R.id.itemtitle);
        title.setText(item.getTitle());
        TextView details = listItemView.findViewById(R.id.itemdetails);
        details.setText(item.getDetails());
        return listItemView;
    }
}
