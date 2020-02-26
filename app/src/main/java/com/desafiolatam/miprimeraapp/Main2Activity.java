package com.desafiolatam.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView nuevaimagen = findViewById(R.id.imagen);


        Picasso.get()
                .load("https://images.unsplash.com/photo-1499618838676-f1a9bc076843?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80")
                .resize(1200, 600)
                .into(nuevaimagen);

        Button mybuttom = findViewById(R.id.mybuttom);
        mybuttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "acabas de ingresar a jumanji", Toast.LENGTH_SHORT).show();

                intentExample();
            }
        });
    }

    private void intentExample(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
