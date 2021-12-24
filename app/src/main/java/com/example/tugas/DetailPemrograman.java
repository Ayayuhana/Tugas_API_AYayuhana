package com.example.tugas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.tugas.model.DataAlgoritma;

public class DetailPemrograman extends AppCompatActivity {
    DataAlgoritma algoritma;
    ImageView logo;
    TextView titleAlgortma,  baca_lebih_lanjut, description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_pemrograman);

        Intent intent = getIntent();
        algoritma = (DataAlgoritma) intent.getSerializableExtra("Algoritma");
        inisialisasiView();
    }

    void inisialisasiView() {
        logo = findViewById(R.id.logo);
        titleAlgortma = findViewById(R.id.jenisAlgo);
        description = findViewById(R.id.deskripsi);
        baca_lebih_lanjut = findViewById(R.id.lihat_detail);
        titleAlgortma.setText(algoritma.getNameAlgoritma());;
        baca_lebih_lanjut.setText(algoritma.getBaca_lebih_lanjut());
        description.setText(algoritma.getDescription());
        Glide
                .with(this)
                .load(algoritma.getLogo())
                .placeholder(R.drawable.ic_refres_foreground)
                .into(logo);
    }

    public void clikToDetail(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(algoritma.getBaca_lebih_lanjut()));
        startActivity(intent);
    }
}
