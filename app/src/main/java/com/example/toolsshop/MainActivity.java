package com.example.toolsshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        listViewTools = findViewById(R.id.listViewTools);
        listViewTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0) {
                    Toast.makeText(getApplicationContext(), R.string.toast_text, Toast.LENGTH_SHORT).show();
                }
                switch (position) {
                    case 0: {
                        Intent intent = new Intent(getApplicationContext(), DrillsCategoryActivity.class);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }
}