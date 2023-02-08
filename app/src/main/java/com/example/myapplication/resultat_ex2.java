package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultat_ex2 extends AppCompatActivity {

    TextView resultat;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_ex2);

        btn = findViewById(R.id.btn_resultat);
        resultat = findViewById(R.id.resultat);
        Bundle i = getIntent().getExtras();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(resultat_ex2.this, exercice2.class));
            }
        });

        if (i.getString("choix") == "somme"){
            resultat.setText(i.getString("choix"));
        }else if(i.getString("choix") == "defference"){
            resultat.setText(i.getString("choix"));
        }else if(i.getString("choix") == "produit"){
            resultat.setText(i.getString("choix"));
        }

        switch (i.getString("choix")){
            case "somme":
                resultat.setText(i.getString("somme"));
                break;
            case "defference":
                resultat.setText(i.getString("defference"));
                break;
            case "produit":
                resultat.setText(i.getString("produit"));
                break;
        }



    }
}