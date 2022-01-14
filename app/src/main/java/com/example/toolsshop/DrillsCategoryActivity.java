package com.example.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DrillsCategoryActivity extends AppCompatActivity {

    private ListView listViewDrills;
    private ArrayList<Drill> drills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drills_category);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle(R.string.drills);
        }

        drills = new ArrayList<>();
        drills.add(new Drill(getString(R.string.interskol_title),getString(R.string.interskol_info),R.drawable.interskol));
        drills.add(new Drill(getString(R.string.makita_title),getString(R.string.makita_info),R.drawable.makita));
        drills.add(new Drill(getString(R.string.dewalt_title),getString(R.string.dewalt_info),R.drawable.dewalt));

        ArrayAdapter<Drill> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, drills);
        listViewDrills = findViewById(R.id.listViewDrills);
        listViewDrills.setAdapter(adapter);
        listViewDrills.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drill drill = drills.get(position);

                Intent intent = new Intent(getApplicationContext(),ProductInfoActivity.class);
                intent.putExtra("title",drill.getTitle());
                intent.putExtra("info",drill.getInfo());
                intent.putExtra("imageId",drill.getImageResId());
                startActivity(intent);
            }
        });
    }
}