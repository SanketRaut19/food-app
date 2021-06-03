package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ResDetailActivity extends AppCompatActivity implements RVResDetailUpdate {

    private RecyclerView recyclerView, recyclerView2;
    private ResDetailAdapter1 resDetailAdapter1;

    ArrayList<ResDetailModel2> resDetailModel1s = new ArrayList();
    ResDetailAdapter2 resDetailAdapter2;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_detail);

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", 0);

        final ArrayList<ResDetailModel1> item = new ArrayList<>();
        item.add(new ResDetailModel1(R.drawable.pizza_logo, pos));
        item.add(new ResDetailModel1(R.drawable.burger_logo, pos));
        item.add(new ResDetailModel1(R.drawable.fries_logo, pos));
        item.add(new ResDetailModel1(R.drawable.sand_witch_logo, pos));
        item.add(new ResDetailModel1(R.drawable.ice_cream_logo, pos));

        recyclerView = findViewById(R.id.rec_view1);
        resDetailAdapter1 = new ResDetailAdapter1(item, this, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(resDetailAdapter1);

        ArrayList<ResDetailModel1>resDetailModel1= new ArrayList<>();
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));
        resDetailModel1.add(new ResDetailModel1(R.drawable.burger,0));


        recyclerView2 = findViewById(R.id.rec_view2);
        resDetailAdapter2 = new ResDetailAdapter2(resDetailModel1s);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView2.setAdapter(resDetailAdapter2);

        return ;
//        return view;
    }




    @Override
    public void callback(int position, ArrayList<ResDetailModel1> resDetailModel1) {

        resDetailAdapter2 = new ResDetailAdapter2(resDetailModel1s);
        resDetailAdapter2.notifyDataSetChanged();
        recyclerView2.setAdapter(resDetailAdapter2);

    }
}
