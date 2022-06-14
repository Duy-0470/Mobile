package com.example.appamnhac.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.appamnhac.R;

public class DanhsachtatcachudeActivity extends AppCompatActivity {
    RecyclerView recyclerViewtatcachude;
    Toolbar toolbartatcachude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachtatcachude);
        init();
    }

    private void init(){
        recyclerViewtatcachude = findViewById(R.id.recyclerviewAllchude);
        toolbartatcachude = findViewById(R.id.toolbarallchude);
        setSupportActionBar(toolbartatcachude);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tất cả chủ đề");
        toolbartatcachude.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}