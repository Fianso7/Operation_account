package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ex3 extends AppCompatActivity {
    Button btn_somme;
    Button btn_defference;
    Button btn_produit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);

        btn_somme = findViewById(R.id.btn_somme);
        btn_defference = findViewById(R.id.btn_defference);
        btn_produit = findViewById(R.id.btn_produit);

        btn_somme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ex3.this, resultat_ex3.class);
                intent.putExtra("operation","somme");
                startActivity(intent);
            }
        });

        btn_defference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ex3.this, resultat_ex3.class);
                intent.putExtra("operation","defference");
                startActivity(intent);
            }
        });

        btn_produit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ex3.this, resultat_ex3.class);
                intent.putExtra("operation","produit");
                startActivity(intent);
            }
        });
    }

}