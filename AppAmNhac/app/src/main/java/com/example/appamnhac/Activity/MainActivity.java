package com.example.appamnhac.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.appamnhac.Adapter.MainViewPaperAdapter;
import com.example.appamnhac.Fragment.Fragment_Trang_Chu;
import com.example.appamnhac.Fragment.Fragmet_Tim_Kiem;
import com.example.appamnhac.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        init();
    }
    private void init() {
        MainViewPaperAdapter mainViewPaperAdapter = new MainViewPaperAdapter(getSupportFragmentManager());
        mainViewPaperAdapter.addFragment(new Fragment_Trang_Chu(), "Trang chu");
        mainViewPaperAdapter.addFragment(new Fragmet_Tim_Kiem(), "Tim kiem");
        viewPager.setAdapter(mainViewPaperAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.icontrangchu);
        tabLayout.getTabAt(1).setIcon(R.drawable.iconsearch);
    }
    private void anhxa() {
        tabLayout = findViewById(R.id.myTabLayout);
        viewPager = findViewById(R.id.myViewPager);
    }
}