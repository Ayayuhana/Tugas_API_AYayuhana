package com.example.tugas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tugas.model.DataAlgoritma;

import java.util.ArrayList;

public class AdapterPemrograman extends ArrayAdapter {
    ArrayList<DataAlgoritma> dataAlgoritma;
    LayoutInflater layoutInflater;
    Context context;

    public AdapterPemrograman(Context context, ArrayList<DataAlgoritma> dataAlgoritma) {
        super(context, R.layout.list_pemrograman, dataAlgoritma);
        this.dataAlgoritma = dataAlgoritma;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.list_pemrograman, parent, false);
        DataAlgoritma dataAlgoritma = this.dataAlgoritma.get(position);

        TextView titleListview = convertView.findViewById(R.id.name_Algoritma);
        ImageView imageView = convertView.findViewById(R.id.logo_Algoritma);

        Glide
                .with(context)
                .load(dataAlgoritma.getLogo())
                .placeholder(R.drawable.ic_refres_foreground)
                .into(imageView);

        titleListview.setText(dataAlgoritma.getNameAlgoritma());

        return convertView;
    }
}
