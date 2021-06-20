package com.learn.himpunanapplikasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends OptionsMenuActivity {
    private RecyclerView rvHimpunan;
    private ArrayList<Himpunan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHimpunan = findViewById(R.id.rv_himpunan);
        rvHimpunan.setHasFixedSize(true);

        list.addAll(DataHimpunan.getListData());
        setActionBarTitle(title);
        showRecyclerItem();
    }

    private void showRecyclerItem(){
        rvHimpunan.setLayoutManager(new LinearLayoutManager(this));
        CardViewHimpunanAdapter cardViewHimpunanAdapter = new CardViewHimpunanAdapter(list);
        rvHimpunan.setAdapter(cardViewHimpunanAdapter);

        cardViewHimpunanAdapter.setOnItemClickCallback(new CardViewHimpunanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Himpunan data) {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("SelectedHimpunan", data);
                OptionsMenuActivity.page = 2;
                startActivity(detailIntent);
            }
        });
    }

}