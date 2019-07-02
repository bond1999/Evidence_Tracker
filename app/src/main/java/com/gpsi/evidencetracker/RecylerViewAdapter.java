package com.gpsi.evidencetracker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecylerViewAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private List<Evidence> mData;

    public RecylerViewAdapter(Context mContext, List<Evidence> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
//        view = (View) mInflater.inflate(R.layout.cardview_evidence_picture);

 //       return new MyViewHolder(view);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }

}
