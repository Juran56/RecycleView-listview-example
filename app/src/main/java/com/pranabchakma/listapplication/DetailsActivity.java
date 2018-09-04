package com.pranabchakma.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    Bundle data;
    String title,details;
    TextView textview_title,textView_details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        data = getIntent().getExtras();
        title = data.getString("title");
        details = data.getString("Details");

       textview_title = findViewById(R.id.item_title);
       textView_details = findViewById(R.id.item_details);

       textview_title.setText(title);
       textView_details.setText(details);
    }
}
