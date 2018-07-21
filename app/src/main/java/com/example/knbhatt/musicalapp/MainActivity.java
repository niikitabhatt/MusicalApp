package com.example.knbhatt.musicalapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tablayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout =(TabLayout)findViewById(R.id.tablayout_id);
        viewPager =(ViewPager)findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new ArtistFragment(),"Artist");
        adapter.AddFragment(new AlbumFragment(),"Album");
        adapter.AddFragment(new SongsFragment(),"Songs");
        adapter.AddFragment(new PlaylistFragment(),"Playlist");
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
        tablayout.getTabAt(0).setIcon(R.drawable.artist);
        tablayout.getTabAt(1).setIcon(R.drawable.album);
        tablayout.getTabAt(2).setIcon(R.drawable.songs);
        tablayout.getTabAt(3).setIcon(R.drawable.playlist);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
