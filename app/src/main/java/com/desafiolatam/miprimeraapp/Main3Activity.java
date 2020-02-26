package com.desafiolatam.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView foto = findViewById(R.id.foto);
        Picasso.get()
                .load("https://img.pngio.com/deadpool-png-images-free-download-imagenes-png-500_407.png")
                .resize(1200, 1200)
                .into(foto);
    }

}
