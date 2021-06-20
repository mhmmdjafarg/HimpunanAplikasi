package com.learn.himpunanapplikasi;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewHimpunanAdapter extends RecyclerView.Adapter<CardViewHimpunanAdapter.CardViewViewHolder> {
    private ArrayList<Himpunan> listHimpunan;

    public CardViewHimpunanAdapter(ArrayList<Himpunan> list) {
        this.listHimpunan = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Himpunan himpunan = listHimpunan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(himpunan.getPhoto())
                .apply(new RequestOptions().override(120, 120))
                .into(holder.imgPhoto);

        holder.tvNamaHimpunan.setText(himpunan.getNamaHimpunan());
        holder.tvSingkatanHimpunan.setText(himpunan.getSingkatanHimpunan());

        holder.btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(v.getContext(), DetailActivity.class);
                detailIntent.putExtra("SelectedHimpunan", listHimpunan.get(holder.getAdapterPosition()));
                OptionsMenuActivity.page = 2;
                v.getContext().startActivity(detailIntent);
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Himpunan h = listHimpunan.get(holder.getAdapterPosition());
                String text = "Lihat instagram official dari " + h.getNamaHimpunan() + " disingkat " + h.getSingkatanHimpunan() + " pada link berikut " + h.getLinkInstagram();
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, text);
                v.getContext().startActivity(Intent.createChooser(sharingIntent, "Share text via"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.listHimpunan.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNamaHimpunan, tvSingkatanHimpunan;
        Button btnProfile, btnShare;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNamaHimpunan = itemView.findViewById(R.id.tv_item_name);
            tvSingkatanHimpunan = itemView.findViewById(R.id.tv_item_singkatan);
            btnProfile = itemView.findViewById(R.id.btn_profile);
            btnShare = itemView.findViewById(R.id.btn_share);
        }
    }
}
