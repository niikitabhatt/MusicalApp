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
public class PlaylistFragment extends Fragment {
   View v;
    public PlaylistFragment() {
    }
    private RecyclerView recyclerview;
    private List<data> lstdata;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.playlist_fragment,container,false);
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
        lstdata.add(new data("Recently added"," ",R.drawable.ic_queue_music_black_24dp));
    }
}
