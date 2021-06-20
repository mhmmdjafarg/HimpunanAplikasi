package com.learn.himpunanapplikasi;

import android.os.Bundle;

public class About_Activity extends OptionsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        setActionBarTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        page = 0;
    }
}