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
public class ArtistFragment extends Fragment {
    View v;
    public ArtistFragment() {
    }
    private RecyclerView recyclerview;
    private List<data> lstdata;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.artist_fragment, container, false);
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
        lstdata.add(new data("K Mohan & Yashita Sharma"," 1 album",R.drawable.artis));
        lstdata.add(new data("Rahat Fatah Ali Khan","1 album",R.drawable.artis));
        lstdata.add(new data("Palak Muchhal"," 1 album",R.drawable.artis));
        lstdata.add(new data("KK"," 1 album",R.drawable.artis));
        lstdata.add(new data("Arijit Singh"," 2 album",R.drawable.artis));
        lstdata.add(new data("Anupam Roy","1 album",R.drawable.artis));
        lstdata.add(new data("Mohit chauhan,Antra Mitra","1 album",R.drawable.artis));
        lstdata.add(new data("Arijit Singh,Palak Mcchhal"," 1 album",R.drawable.artis));
        lstdata.add(new data("K Mohan & Yashita Sharma"," 1 album",R.drawable.artis));
        lstdata.add(new data("K Mohan & Yashita Sharma"," 1 album",R.drawable.artis));

    }
}