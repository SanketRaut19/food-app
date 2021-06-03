package com.example.foodapp;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.StaticRVViewHolder>{

    private ArrayList<StaticRvModel> items;
    int row_index = -1;
    UpdateRecycleView updateRecycleView;
    Activity activity;
    boolean check = true;
    boolean select = true;

    public RvAdapter(ArrayList<StaticRvModel> items, Activity activity, UpdateRecycleView updateRecycleView) {
        this.items = items;
        this.activity = activity;
        this.updateRecycleView = updateRecycleView;
    }

    @NonNull
    @Override
    public StaticRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.static_rv_item, parent, false);
        StaticRVViewHolder staticRVViewHolder = new StaticRVViewHolder(view);
        return staticRVViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StaticRVViewHolder holder, final int position) {

        StaticRvModel currentItem = items.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.textView.setText(currentItem.getText());

        if(check){
            ArrayList<DinamicRVModel> items = new ArrayList<DinamicRVModel>();
            items.add(new DinamicRVModel("Burger 1", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 2", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 3", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 4", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 5", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 6", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 7", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 8", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 9", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 10", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 11", R.drawable.burger,0));
            items.add(new DinamicRVModel("Burger 12", R.drawable.burger,0));

            updateRecycleView.callback(position, items);
            check = false;
        }

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();

                if(position==0){
                    ArrayList<DinamicRVModel> items = new ArrayList<DinamicRVModel>();
                    items.add(new DinamicRVModel("Burger 1", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 2", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 3", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 4", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 5", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 6", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 7", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 8", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 9", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 10", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 11", R.drawable.burger,0));
                    items.add(new DinamicRVModel("Burger 12", R.drawable.burger,0));

                    updateRecycleView.callback(position, items);

                }

                else if(position==1) {
                    ArrayList<DinamicRVModel> items = new ArrayList<DinamicRVModel>();
                    items.add(new DinamicRVModel("Pizza 1", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 2", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 3", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 4", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 5", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 6", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 7", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 8", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 9", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 10", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 11", R.drawable.pizza,1));
                    items.add(new DinamicRVModel("pizza 12", R.drawable.pizza,1));

                }

                else if(position==2) {
                    ArrayList<DinamicRVModel> items = new ArrayList<DinamicRVModel>();
                    items.add(new DinamicRVModel("Fries 1", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 2", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 3", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 4", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 5", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 6", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 7", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 8", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 9", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 10", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 11", R.drawable.fries,2));
                    items.add(new DinamicRVModel("Fries 12", R.drawable.fries,2));

                }

                else if(position==3) {
                    ArrayList<DinamicRVModel> items = new ArrayList<DinamicRVModel>();
                    items.add(new DinamicRVModel("Sand Witch 1", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 2", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 3", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 4", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 5", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 6", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 7", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 8", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 9", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 10", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 11", R.drawable.sand_witch,3));
                    items.add(new DinamicRVModel("Sand Witch 12", R.drawable.sand_witch,3));

                }

                else if(position==4) {
                    ArrayList<DinamicRVModel> items = new ArrayList<DinamicRVModel>();
                    items.add(new DinamicRVModel("Ice-Cream 1", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 2", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 3", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 4", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 5", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 6", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 7", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 8", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 9", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 10", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 11", R.drawable.ice_cream,4));
                    items.add(new DinamicRVModel("Ice-Cream 12", R.drawable.ice_cream,4));
                }
            }
        });

        if(select){
            if(position==0)
                holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected);
        }
        else {
            if(row_index == position){
                holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected);
            }else {
                holder.linearLayout.setBackgroundResource(R.drawable.r_view_bg);
            }
        }



    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class StaticRVViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;

        public StaticRVViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.text1);
            imageView = itemView.findViewById(R.id.img1);
            linearLayout = itemView.findViewById(R.id.linear_layout);
        }
    }
}
