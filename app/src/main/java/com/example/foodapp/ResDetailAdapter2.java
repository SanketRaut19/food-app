package com.example.foodapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResDetailAdapter2  extends RecyclerView.Adapter<ResDetailAdapter2.ResDetailViewHolder>{

    public ArrayList<ResDetailModel2> resDetailModel2;

    public ResDetailAdapter2(ArrayList<ResDetailModel2> resDetailModel2){
        this.resDetailModel2 = resDetailModel2;
    }

    public class ResDetailViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView, review, rev_num, detail;
        ConstraintLayout constraintLayout;

        public ResDetailViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.name);
            constraintLayout = itemView.findViewById(R.id.constraintLayout2);
            rev_num = itemView.findViewById(R.id.rev_num);
            review = itemView.findViewById(R.id.review);
            detail = itemView.findViewById(R.id.detailss);
        }
    }

    @NonNull
    @Override
    public ResDetailAdapter2.ResDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.res_detail_layout,parent,false);
        ResDetailAdapter2.ResDetailViewHolder resDetailHolder = new ResDetailAdapter2.ResDetailViewHolder(view);
        return resDetailHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ResDetailAdapter2.ResDetailViewHolder holder, int position) {
        ResDetailModel2 currentItem = resDetailModel2.get(position);
        holder.textView.setText(currentItem.getName());
        holder.detail.setText(currentItem.getDetail());
        holder.rev_num.setText(currentItem.getRev_num());
//        holder.review.setText(currentItem.getReview());

    }

    @Override
    public int getItemCount() {
        return resDetailModel2.size();
    }



}
