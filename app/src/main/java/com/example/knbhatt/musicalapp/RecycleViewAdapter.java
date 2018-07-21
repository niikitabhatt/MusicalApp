package com.example.knbhatt.musicalapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by KN Bhatt on 7/20/2018.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {
    Context context;
    List<data> d;

    public RecycleViewAdapter(Context context, List<data> d) {
        this.context = context;
        this.d = d;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.albumartistlayout, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_Songs.setText(d.get(position).getSong());
        holder.tv_Singer.setText(d.get(position).getSinger());
        holder.img.setImageResource(d.get(position).getPhoto());
    }
    @Override
    public int getItemCount() {
        return d.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_Songs;
        private TextView tv_Singer;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_Songs = (TextView) itemView.findViewById(R.id.aname_songs);
            tv_Singer = (TextView) itemView.findViewById(R.id.aname_singer);
            img = (ImageView) itemView.findViewById(R.id.aimage_music);
        }}
}
