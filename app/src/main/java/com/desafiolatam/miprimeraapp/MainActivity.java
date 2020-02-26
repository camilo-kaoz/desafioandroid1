package com.desafiolatam.miprimeraapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ojos = findViewById(R.id.ojos);
        Picasso.get().load("https://cdn.pixabay.com/photo/2016/09/02/14/22/eyes-vector-1639322_960_720.png").into(ojos);

        Button botone = findViewById(R.id.botone);
        botone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ingresa los datos merme", Toast.LENGTH_SHORT).show();
            }
        });

        Button botone2 = findViewById(R.id.botone2);
        botone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentone = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intentone);
            }
        });



      /*  Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);*/

    }
}
