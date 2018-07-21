package com.example.knbhatt.musicalapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by KN Bhatt on 7/18/2018.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<data> mdata;

    public RecyclerViewAdapter(Context mContext, List<data> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_layout, parent, false);
         MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.tv_Songs.setText(mdata.get(position).getSong());
        holder.tv_Singer.setText(mdata.get(position).getSinger());
        holder.img.setImageResource(mdata.get(position).getPhoto());
       holder.linearLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(mContext,SonglayoutActivity.class);
               intent.putExtra("singername",mdata.get(position).getSinger());
               intent.putExtra("songname",mdata.get(position).getSong());
              mContext.startActivity(intent);
           }
       });
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private  LinearLayout linearLayout;
        private TextView tv_Songs;
        private TextView tv_Singer;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
             linearLayout=(LinearLayout)itemView.findViewById(R.id.listlayout);
            tv_Songs = (TextView) itemView.findViewById(R.id.name_songs);
            tv_Singer = (TextView) itemView.findViewById(R.id.name_singer);
            img = (ImageView) itemView.findViewById(R.id.image_music);
        }}
}
