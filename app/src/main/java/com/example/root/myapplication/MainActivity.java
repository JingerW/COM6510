package com.example.root.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set layout view
        setContentView(R.layout.activity_main);
        // navigation layout view
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        // navigation listener
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GallaryFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch(menuItem.getItemId()) {
                        case R.id.bottom_nav_search:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SearchFragment()).commit();
                            break;
                        case R.id.bottom_nav_map:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MapFragment()).commit();
                            break;
                        case R.id.bottom_nav_gallary:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GallaryFragment()).commit();
                            break;
                    }

                    return true;
                }
            };
}
