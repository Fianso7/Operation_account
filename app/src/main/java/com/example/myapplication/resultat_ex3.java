package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class resultat_ex3 extends AppCompatActivity {

    EditText nb1,nb2;
    Button btn_calcul,btn_roteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_ex3);

        nb1 = findViewById(R.id.nb1);
        nb2 = findViewById(R.id.nb2);
        btn_calcul = findViewById(R.id.btn_calcul);
        btn_roteur = findViewById(R.id.btn_roteur);

        Bundle i = getIntent().getExtras();


        btn_calcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i.getString("operation")){
                    case "somme":
                        double res1 = somme(Double.parseDouble(nb1.getText().toString()),Double.parseDouble(nb2.getText().toString()));
                        Toast.makeText(resultat_ex3.this, ""+nb1.getText() + " + "+nb2.getText() + " = "+res1, Toast.LENGTH_SHORT).show();
                        break;
                    case "defference":
                        double res2 = defference(Double.parseDouble(nb1.getText().toString()),Double.parseDouble(nb2.getText().toString()));
                        Toast.makeText(resultat_ex3.this, ""+nb1.getText() + " - "+nb2.getText() + " = "+res2, Toast.LENGTH_SHORT).show();
                        break;
                    case "produit":
                        double res3 = produit(Double.parseDouble(nb1.getText().toString()),Double.parseDouble(nb2.getText().toString()));
                        Toast.makeText(resultat_ex3.this, ""+nb1.getText() + " * "+nb2.getText() + " = "+res3, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        btn_roteur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(resultat_ex3.this,Ex3.class);
                startActivity(intent);
            }
        });

    }
    public double somme(double nb1,double nb2){
        return nb1 + nb2;
    }
    public double defference(double nb1, double nb2){
        return nb1 - nb2;
    }
    public double produit(double nb1, double nb2){
        return nb1 * nb2;
    }
}