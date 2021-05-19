package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    private Button btnMainSumar, btnMainRestar, btnMainZoomMas, btnMainZoomMenos, btnMainOcultar, btnMainReset;
    private TextView txvMainNumero;
    private int cont = 0;
    float tamaño = 20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViews();
    }

    private void findViews(){
        btnMainSumar = findViewById(R.id.btnMainSumar);
        btnMainRestar = findViewById(R.id.btnMainRestar);
        btnMainZoomMas = findViewById(R.id.btnMainZoomMas);
        btnMainZoomMenos = findViewById(R.id.btnMainZoomMenos);
        btnMainOcultar = findViewById(R.id.btnMainOcultar);
        btnMainReset = findViewById(R.id.btnMainReset);
        txvMainNumero = findViewById(R.id.txvMainNumero);

        btnMainSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                imprimir();
            }
        });

        btnMainRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cont > 0) {
                    cont--;
                    imprimir();
                }
            }
        });

        btnMainReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont = 0;
                imprimir();
            }
        });

        btnMainZoomMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tamaño = tamaño + 5;
                txvMainNumero.setTextSize(tamaño);
            }
        });

        btnMainZoomMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tamaño = tamaño - 5;
                txvMainNumero.setTextSize(tamaño);
            }
        });

        btnMainOcultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txvMainNumero.getVisibility()==View.VISIBLE){
                    txvMainNumero.setVisibility(View.INVISIBLE);
                }else{
                    txvMainNumero.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    private void imprimir(){
        txvMainNumero.setText(String.valueOf(cont));
    }


}