package com.kaique.acitivityfragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    ImageView result;
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result = findViewById(R.id.idResultado);
        voltar = findViewById(R.id.voltar);

        Bundle dados = getIntent().getExtras();

        int resultado = dados.getInt("nuemro");

        if(resultado == 0){
            result.setImageResource(R.drawable.img);

        }else result.setImageResource(R.drawable.img_1);

        voltar.setOnClickListener(view -> finish());

    }
}