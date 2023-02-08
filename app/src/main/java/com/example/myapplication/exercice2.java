package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class exercice2 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton somme;
    RadioButton defference;
    RadioButton produit;
    EditText nb1;
    EditText nb2;
    Button btn_res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice2);

        somme = findViewById(R.id.somme);
        defference = findViewById(R.id.defference);
        produit = findViewById(R.id.produit);
        radioGroup = findViewById(R.id.radio_group);
        nb1 = findViewById(R.id.nb1);
        nb2 = findViewById(R.id.nb2);
        btn_res = findViewById(R.id.resultat);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.somme:
                        btn_res.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(exercice2.this, resultat_ex2.class);
                                double res = somme(Double.parseDouble(nb1.getText().toString()), Double.parseDouble(nb2.getText().toString()));
                                intent.putExtra("somme", "" + res);
                                intent.putExtra("choix", "somme");
                                startActivity(intent);

                            }
                        });
                        break;
                    case R.id.defference:
                        btn_res.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(exercice2.this, resultat_ex2.class);
                                double res = defference(Double.parseDouble(nb1.getText().toString()), Double.parseDouble(nb2.getText().toString()));
                                intent.putExtra("defference", "" + res);
                                intent.putExtra("choix", "defference");
                                startActivity(intent);

                            }
                        });
                        break;
                    case R.id.produit:
                        btn_res.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(exercice2.this, resultat_ex2.class);
                                double res = produit(Double.parseDouble(nb1.getText().toString()), Double.parseDouble(nb2.getText().toString()));
                                intent.putExtra("produit", "" + res);
                                intent.putExtra("choix", "produit");
                                startActivity(intent);


                            }
                        });
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + i);
                }
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