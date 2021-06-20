package com.learn.himpunanapplikasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class OptionsMenuActivity extends AppCompatActivity {
    public static int page = 1;
    public static String title = "List Himpunan";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.list_himpunan:
                if (page != 1) {
                    Intent mainIntent = new Intent(OptionsMenuActivity.this, MainActivity.class);
                    startActivity(mainIntent);
                    title = "List Himpunan";
                    page = 1;
                }
                break;
            case R.id.about_menu:
                if (page != 0) {
                    Intent aboutintent = new Intent(OptionsMenuActivity.this, About_Activity.class);
                    startActivity(aboutintent);
                    title = "About";
                    page = 0;
                }
                break;
        }
    }

    protected void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}