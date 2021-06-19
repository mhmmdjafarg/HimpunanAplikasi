package com.learn.himpunanapplikasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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
        showRecyclerItem();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        setMode(item.getItemId());
//        return super.onOptionsItemSelected(item);
//    }
//
//    public void setMode(int selectedMode) {
//        switch (selectedMode) {
//            case R.id.list_himpunan:
//                showRecyclerItem();
//                break;
//
//            case R.id.about_menu:
//                Intent aboutintent = new Intent(MainActivity.this, About_Activity.class);
//                startActivity(aboutintent);
//                break;
//        }
//    }

    private void showRecyclerItem(){
        rvHimpunan.setLayoutManager(new LinearLayoutManager(this));
        CardViewHimpunanAdapter cardViewHimpunanAdapter = new CardViewHimpunanAdapter(list);
        rvHimpunan.setAdapter(cardViewHimpunanAdapter);
    }

}