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
public class AlbumFragment extends Fragment {
    View v;

    public AlbumFragment() {
    }
    private RecyclerView recyclerview;
    private List<data> lstdata;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.album_fragment, container, false);
        recyclerview = (RecyclerView) v.findViewById(R.id.recyclerview);
        RecycleViewAdapter recycleAdapter= new RecycleViewAdapter(getContext(),lstdata);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setAdapter(recycleAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstdata= new ArrayList<>();
        lstdata.add(new data("2 STATES(2014)","K Mohan & Yashita Sharma",R.drawable.twostates));
        lstdata.add(new data("Afreen Afreen","Rahat Fatah Ali Khan",R.drawable.afreenafreen));
        lstdata.add(new data("Kaun Tuje","Palak Muchhal",R.drawable.kauntuje));
        lstdata.add(new data("Kites","KK",R.drawable.kites));
        lstdata.add(new data("Phir Bhi tumko Chahunga","Arijit Singh",R.drawable.phirbhitumkochahunga));
        lstdata.add(new data("Piku","Anupam Roy",R.drawable.piku));
        lstdata.add(new data("Rajneeti","Mohit chauhan,Antra Mitra",R.drawable.rajneeti));
        lstdata.add(new data("Rustom","Arijit Singh,Palak Mcchhal",R.drawable.rustom));
        lstdata.add(new data("Simran","Arijit Singh",R.drawable.simran));
        lstdata.add(new data("2 STATES(2014)","K Mohan & Yashita Sharma",R.drawable.twostates));
        lstdata.add(new data("2 STATES(2014)","K Mohan & Yashita Sharma",R.drawable.twostates));
    }
    }




