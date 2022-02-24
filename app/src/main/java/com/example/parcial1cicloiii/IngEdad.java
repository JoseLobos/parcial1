package com.example.parcial1cicloiii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class IngEdad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ing_edad);

            final EditText eNombre = (EditText)findViewById(R.id.etNombre);
            final EditText eEdad = (EditText)findViewById(R.id.etEdad);

        Bundle datosRecibidos = this.getIntent().getExtras();

       String nombreCompleto = datosRecibidos.getString("cNombre");

       eNombre.setText(nombreCompleto);

            Button bEnviar = (Button)findViewById(R.id.btnEnviar);
            bEnviar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String edad = eEdad.getText().toString();

                    Bundle pasarDatos = new Bundle();

                    pasarDatos.putString("cNombre",nombreCompleto);
                    pasarDatos.putString("pEdad",edad);

                    Intent siga = new Intent(IngEdad.this,Determinar.class);
                    siga.putExtras(pasarDatos);
                    startActivity(siga);
                }
            });

        }
}