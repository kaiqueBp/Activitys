package com.kaique.acitivityfragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Serializable;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int numero = new Random().nextInt(2);

//        botao.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                Usuario usuario = new Usuario("Kaique","kaique@outlook.com","testr125",21);
//
//                intent.putExtra("nome","Kaíque");
//                intent.putExtra("idade",21);
//                intent.putExtra("objeto",usuario);
//                startActivity(intent);
//            }
//        });
    }
    public void ChamarActivity(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

        int numero = new Random().nextInt(2);
        intent.putExtra("nuemro",numero);

        startActivity(intent);
    }
}

