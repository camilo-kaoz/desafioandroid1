package com.desafiolatam.miprimeraapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ojos = findViewById(R.id.imagen);


        Picasso.get()
                .load("https://images.unsplash.com/photo-1499618838676-f1a9bc076843?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80")
                .resize(1200, 600)
                .into(ojos);

      /*  Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);*/


    }}