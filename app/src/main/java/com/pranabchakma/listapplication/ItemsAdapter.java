package com.pranabchakma.listapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {
    List<Item> itemList;
    Context context;

    public ItemsAdapter(List<Item> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public ItemViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder( ItemViewHolder holder,final int position) {
        final Item item = itemList.get(position);
        holder.title.setText(item.getTitle());
        holder.details.setText(item.getDetails());
        holder.check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailsActivity.class);
                Bundle data = new Bundle();
                data.putString("title",item.getTitle());
                data.putString("Details",item.getDetails());
                intent.putExtras(data);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        public TextView title,details;
        public Button check;
        public ItemViewHolder(View itemView) {
            super(itemView);
            title= itemView.findViewById(R.id.itemtitle);
            details = itemView.findViewById(R.id.itemdetails);
            check = itemView.findViewById(R.id.checkDetails);
        }
    }
}
