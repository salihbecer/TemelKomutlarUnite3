package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn6;
    Button btn7;
    Button btnuyg8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button temelkomutlaragit = findViewById(R.id.btn1);
        Button uygulama2 = findViewById(R.id.btn2);
        Button uygulama3 = findViewById(R.id.btn3);
        Button uygulama4 = findViewById(R.id.btn4);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btnuyg8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);


        temelkomutlaragit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sa = new Intent(MainActivity.this, Uyg1Activity.class);
                startActivity(sa);
            }
        });
        uygulama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent as = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(as);
            }
        });
        uygulama3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(a);
            }
        });
        uygulama4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Uyg5Activity.class);
                startActivity(a);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Uyg6Activity.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg7Activity.class);
                startActivity(i);
            }
        });
        btnuyg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Uyg8Activity.class);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Uyg9Activity.class);
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Uyg10Activity.class);
                startActivity(i);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Uyg11Activity.class);
                startActivity(i);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Uyg12Activity.class);
                startActivity(i);
            }
        });

    }
}