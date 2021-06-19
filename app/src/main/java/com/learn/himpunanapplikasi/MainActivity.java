package com.learn.himpunanapplikasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHimpunan;
    private ArrayList<Himpunan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHimpunan = findViewById(R.id.rv_himpunan);
        rvHimpunan.setHasFixedSize(true);

        list.addAll(DataHimpunan.getListData());
        showRecyclerItem();
    }

    private void showRecyclerItem(){
        rvHimpunan.setLayoutManager(new LinearLayoutManager(this));
        CardViewHimpunanAdapter cardViewHimpunanAdapter = new CardViewHimpunanAdapter(list);
        rvHimpunan.setAdapter(cardViewHimpunanAdapter);
    }

}