package com.learn.himpunanapplikasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class OptionsMenuActivity extends AppCompatActivity {
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
                Intent mainIntent = new Intent(OptionsMenuActivity.this, MainActivity.class);
                startActivity(mainIntent);
                break;

            case R.id.about_menu:
                Intent aboutintent = new Intent(OptionsMenuActivity.this, About_Activity.class);
                startActivity(aboutintent);
                break;
        }
    }
}