package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SegundaActividad extends AppCompatActivity {

    private Button btnSegundaConvertir,btnSegundaReiniciar;
    private EditText edtSegundaMonto, edtSegundaResultado;
    private RadioButton rbtSegundoDolar, rbtSegundaEuro, rbtSegundaReal;
    private RadioGroup rgpSegundaMoneda;
    private double dolar = 99.33;
    private double euro = 117.20;
    private double real = 18.62;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        this.findViews();

    }

    private void findViews() {
        btnSegundaConvertir = findViewById(R.id.btnSegundaConvertir);
        btnSegundaReiniciar = findViewById(R.id.btnSegundaReiniciar);
        edtSegundaMonto = findViewById(R.id.edtSegundaMonto);
        edtSegundaResultado = findViewById(R.id.edtSegundaResultado);
        rgpSegundaMoneda = findViewById(R.id.rgpSegundaMoneda);
        rbtSegundaEuro = findViewById(R.id.rbtSegundaEuro);
        rbtSegundaReal = findViewById(R.id.rbtSegundaReal);
        rbtSegundoDolar = findViewById(R.id.rbtSegundoDolar);

        btnSegundaConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    convertirMoneda();
            }
        });

        btnSegundaReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtSegundaMonto.setText(" ");
                edtSegundaResultado.setText(" ");
            }
        });

    }

    private void convertirMoneda(){
        Double monto = Double.parseDouble(edtSegundaMonto.getText().toString());
        Double montodolar = 0.0;
        Double montoreal = 0.0;
        Double montoeuro = 0.0;

        if(rbtSegundoDolar.isChecked()) {
            montodolar = monto * dolar;
            edtSegundaResultado.setText(montodolar.toString());
        }

        if(rbtSegundaReal.isChecked()) {
            montoreal = monto * real;
            edtSegundaResultado.setText(montoreal.toString());
        }

        if(rbtSegundaEuro.isChecked()) {
            montoeuro = monto * euro;
            edtSegundaResultado.setText(montoeuro.toString());
        }

    }
}