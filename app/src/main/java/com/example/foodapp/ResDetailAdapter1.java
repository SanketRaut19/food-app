package com.example.foodapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResDetailAdapter1 extends RecyclerView.Adapter<ResDetailAdapter1.ResDetailViewHolder> {
    private ArrayList<ResDetailModel1> resDetailModel2s;
    int row_index = -1;
    RVResDetailUpdate rvResDetailUpdate;
    Activity activity;
    boolean check = true;
    boolean select = true;
    int p;

    public ResDetailAdapter1(ArrayList<ResDetailModel1> resDetailModel2, Activity activity, RVResDetailUpdate rvResDetailUpdate) {
        this.resDetailModel2s = resDetailModel2;
        this.activity = activity;
        this.rvResDetailUpdate = rvResDetailUpdate;
    }

    @NonNull
    @Override
    public ResDetailAdapter1.ResDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.res_detail_layout2, parent, false);
        ResDetailAdapter1.ResDetailViewHolder resDetailViewHolder = new ResDetailAdapter1.ResDetailViewHolder(view);
        return resDetailViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ResDetailAdapter1.ResDetailViewHolder holder, final int position) {

        ResDetailModel1 currentItem = resDetailModel2s.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
         p= currentItem.getPos();


        if(check){
            if(p==0) {
                ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));


                rvResDetailUpdate.callback(position, resDetailModel2s);
            }

                 else if(p==1) {

                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Pizza 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 12", 200, (float) 4.6, 201));

                }

                else if(p==2) {
                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Fries 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 12", 200, (float) 4.6, 201));

                }

                else if(p==3) {
                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Sand witch 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 12", 200, (float) 4.6, 201));

                }

                else if(p==4) {
                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 12", 200, (float) 4.6, 201));
                }
                check = false;
        }


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();

                if(position==0){
                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Burger 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Burger 12", 200, (float) 4.6, 201));

                    rvResDetailUpdate.callback(position, resDetailModel2s);

                }

                else if(position==1) {

                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Pizza 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Pizza 12", 200, (float) 4.6, 201));

                }

                else if(position==2) {
                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Fries 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Fries 12", 200, (float) 4.6, 201));

                }

                else if(position==3) {
                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Sand witch 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Sand witch 12", 200, (float) 4.6, 201));

                }

                else if(position==4) {
                    ArrayList<ResDetailModel2> resDetailModel2 = new ArrayList<ResDetailModel2>();
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 1", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 2", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 3", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 4", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 5", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 6", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 7", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 8", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 9", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 10", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 11", 200, (float) 4.6, 201));
                    resDetailModel2.add(new ResDetailModel2("Ice-cream 12", 200, (float) 4.6, 201));
                }
            }
        });



            if(row_index == position){
                holder.linearLayout.setBackgroundResource(R.drawable.res_detail_selected);
            }else {
                holder.linearLayout.setBackgroundResource(R.drawable.res_bg);
            }

    }

    @Override
    public int getItemCount() {
        return resDetailModel2s.size();
    }

    public static class ResDetailViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;

        public ResDetailViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img1);
            linearLayout = itemView.findViewById(R.id.linear_layout);
        }
    }
}
