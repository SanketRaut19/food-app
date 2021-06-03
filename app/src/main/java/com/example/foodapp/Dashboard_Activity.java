package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.foodapp.DRVinterface.LoadMore;
import com.example.foodapp.fragments.AboutUsFragment;
import com.example.foodapp.fragments.DashBoardFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Dashboard_Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RvAdapter adapter;

    List<DinamicRVModel> items = new ArrayList();
    DynamicRVAdapter dynamicRVAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        FragmentManager supportFragmentWrapper = this.getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = supportFragmentWrapper.beginTransaction();
        fragmentTransaction.replace(R.id.dashboardLayout, new DashBoardFragment());
        fragmentTransaction.commit();


       /* final ArrayList<StaticRvModel> item = new ArrayList<>();
        item.add(new StaticRvModel(R.drawable.pizza, "Pizza"));
        item.add(new StaticRvModel(R.drawable.burger, "Burger"));
        item.add(new StaticRvModel(R.drawable.fries, "Fries"));
        item.add(new StaticRvModel(R.drawable.sand_witch, "Sand witch"));
        item.add(new StaticRvModel(R.drawable.ice_cream, "Ice-cream"));

        recyclerView = findViewById(R.id.r_View1);
        adapter = new RvAdapter(item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));
        items.add(new DinamicRVModel("Burger"));

        RecyclerView div = findViewById(R.id.r_View2);
        div.setLayoutManager(new LinearLayoutManager(this));
        dynamicRVAdapter = new DynamicRVAdapter(div, this, items);
        div.setAdapter(dynamicRVAdapter);

        dynamicRVAdapter.setLoadMore(new LoadMore() {
            @Override
            public void onLoadMore() {
                if(items.size()<=20){
                item.add(null);
                dynamicRVAdapter.notifyItemInserted(items.size()-1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        items.remove(items.size()-1);
                        dynamicRVAdapter.notifyItemRemoved(items.size());

                        int index = items.size();
                        int end = index+10;
                        for(int i = index; i<end; i++){
                            String name = UUID.randomUUID().toString();
                            DinamicRVModel itemss = new DinamicRVModel(name);
                            items.add(itemss);
                        }
                        dynamicRVAdapter.notifyDataSetChanged();
                        dynamicRVAdapter.setLoaded();
                    }
                },4000);
                }
                else
                    Toast.makeText(Dashboard_Activity.this, "Data Completed", Toast.LENGTH_SHORT).show();
            }
        });*/

    }
}