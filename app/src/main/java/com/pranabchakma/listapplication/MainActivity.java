package com.pranabchakma.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ListView listView;
    List<Item> itemsList;
    ItemsAdapter itemsAdapter;
    //ItemListAdapter itemsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemsList = getItems();
        //listView = findViewById(R.id.listView);
        //itemsAdapter = new ItemListAdapter(this,itemsList);
        //listView.setAdapter(itemsAdapter);

        itemsAdapter = new ItemsAdapter(itemsList,this);
        recyclerView = findViewById(R.id.recycleView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemsAdapter);
    }

    public List<Item> getItems() {
        List<Item> itemslist= new ArrayList<>();
        itemslist.add(new Item("hello","details"));
        itemslist.add(new Item("hello","details"));
        itemslist.add(new Item("hello","details"));
        return itemslist;
    }
}
