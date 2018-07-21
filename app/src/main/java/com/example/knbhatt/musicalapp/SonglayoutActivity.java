package com.example.knbhatt.musicalapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by KN Bhatt on 7/19/2018.
 */
public class SonglayoutActivity extends AppCompatActivity {

    private static final String TAG="Song Play";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songlayout);
        Log.d(TAG,"oncreate started");
        getIncomingIntent();
    }
    private void getIncomingIntent(){
        Log.d(TAG,"get incoming intent:cheching for incoming intent");
        if(getIntent().hasExtra("songname") && getIntent().hasExtra("singername")){
            String song= getIntent().getStringExtra("songname");
            String singer = getIntent().getStringExtra("singername");
            setData(song,singer);
        }}
    private  void setData(String song, String singer){
        TextView songName= (TextView)findViewById(R.id.songname);
        TextView singerName=(TextView)findViewById(R.id.singername);
        songName.setText(song);
        singerName.setText(singer);

    }
}
