package com.example.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductInfoActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private TextView textViewInfo;
    private ImageView imageViewProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }

        textViewTitle = findViewById(R.id.textViewTitle);
        textViewInfo = findViewById(R.id.textViewInfo);
        imageViewProduct = findViewById(R.id.imageViewProduct);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String info = intent.getStringExtra("info");
        int imageId = intent.getIntExtra("imageId",0);

        textViewTitle.setText(title);
        textViewInfo.setText(info);
        imageViewProduct.setImageResource(imageId);
    }
}