package com.example.foodapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.DinamicRVModel;
import com.example.foodapp.DynamicRVAdapter;
import com.example.foodapp.R;
import com.example.foodapp.ResDetailActivity;
import com.example.foodapp.RvAdapter;
import com.example.foodapp.StaticRvModel;
import com.example.foodapp.UpdateRecycleView;

import java.util.ArrayList;

public class DashBoardFragment extends Fragment implements UpdateRecycleView {
//public class DashBoardFragment extends Fragment {

    private RecyclerView recyclerView, recyclerView2;
    private RvAdapter adapter;

    ArrayList<DinamicRVModel> items = new ArrayList();
    DynamicRVAdapter dynamicRVAdapter;
    int pos;

    //    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.dashboard_fragment, container, false);
//        View view = inflater.inflate(R.layout.dashboard_fragment, container, false);

        final ArrayList<StaticRvModel> item = new ArrayList<>();
        item.add(new StaticRvModel(R.drawable.pizza, "Pizza"));
        item.add(new StaticRvModel(R.drawable.burger, "Burger"));
        item.add(new StaticRvModel(R.drawable.fries, "Fries"));
        item.add(new StaticRvModel(R.drawable.sand_witch, "Sand witch"));
        item.add(new StaticRvModel(R.drawable.ice_cream, "Ice-cream"));
        Log.d("ABCDEF", "this is dashboard fragment and items are:" + item);
        recyclerView = root.findViewById(R.id.r_View1);
        adapter = new RvAdapter(item, getActivity(), this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        items = new ArrayList<>();

        recyclerView2 = root.findViewById(R.id.r_View2);
        dynamicRVAdapter = new DynamicRVAdapter(items);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView2.setAdapter(dynamicRVAdapter);

        return root;
//        return view;
    }


    @Override
    public void callback(int position, final ArrayList<DinamicRVModel> items) {

        dynamicRVAdapter = new DynamicRVAdapter(items);
        dynamicRVAdapter.notifyDataSetChanged();
        recyclerView2.setAdapter(dynamicRVAdapter);

        dynamicRVAdapter.setOnItemClickListner(new DynamicRVAdapter.OnItemClickListner() {
            @Override
            public void onItemClick(int position) {
                pos = items.get(position).getPos();

                Intent intent = new Intent(getActivity(), ResDetailActivity.class);
                intent.putExtra("pos", pos);
                startActivity(intent);
            }
        });

    }
}
