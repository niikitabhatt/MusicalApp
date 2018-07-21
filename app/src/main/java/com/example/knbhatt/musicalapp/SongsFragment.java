package com.example.knbhatt.musicalapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KN Bhatt on 7/17/2018.
 */
public class SongsFragment extends Fragment {
   View v;

    public SongsFragment() {
    }
    private RecyclerView myrecyclerview;
    private List<data> lstdata;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.songs_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.arecyclerview);
        RecyclerViewAdapter recyclerAdapter= new RecyclerViewAdapter(getContext(),lstdata);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstdata= new ArrayList<>();
        lstdata.add(new data("Chaandaniya","K Mohan & Yashita Sharma",R.drawable.twostates));
        lstdata.add(new data("Afreen Afreen","Rahat Fatah Ali Khan",R.drawable.afreenafreen));
        lstdata.add(new data("Kaun Tuje","Palak Muchhal",R.drawable.kauntuje));
        lstdata.add(new data("Zindagi Do Pal Ki","KK",R.drawable.kites));
        lstdata.add(new data("Phir Bhi tumko Chahunga","Arijit Singh",R.drawable.phirbhitumkochahunga));
        lstdata.add(new data("Bezubaan","Anupam Roy",R.drawable.piku));
        lstdata.add(new data("Beegi Si Bhaagi Si","Mohit chauhan,Antra Mitra",R.drawable.rajneeti));
        lstdata.add(new data("Dekha Hzaro Dafaa","Arijit Singh,Palak Mcchhal",R.drawable.rustom));
        lstdata.add(new data("Meet","Arijit Singh",R.drawable.simran));
        lstdata.add(new data("2 STATES(2014)","K Mohan & Yashita Sharma",R.drawable.twostates));
        lstdata.add(new data("2 STATES(2014)","K Mohan & Yashita Sharma",R.drawable.twostates));

    }
}
