package com.learn.himpunanapplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends OptionsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        page = 2;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imgPhoto = findViewById(R.id.photo_himpunan);
        TextView titleHimpunan = findViewById(R.id.title_himpunan);
        TextView singkatanHimpunan = findViewById(R.id.singkatan_himpunan);
        TextView deskripsiHimpunan = findViewById(R.id.deskripsi_himpunan);
        Button instagramBtn = findViewById(R.id.social_himpunan);

        Himpunan himpunan = (Himpunan) getIntent().getSerializableExtra("SelectedHimpunan");
        //Set title
        setActionBarTitle(himpunan.getSingkatanHimpunan());

        imgPhoto.setImageResource(himpunan.getPhoto());
        titleHimpunan.setText(himpunan.getNamaHimpunan());
        singkatanHimpunan.setText(himpunan.getSingkatanHimpunan());
        deskripsiHimpunan.setText(himpunan.getDeskripsi());

        instagramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(himpunan.getLinkInstagram());
                Intent instagram = new Intent(Intent.ACTION_VIEW, uri);
                instagram.setPackage("com.instagram.android");
                try {
                    startActivity(instagram);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(himpunan.getLinkInstagram())));
                }
            }
        });
    }
}