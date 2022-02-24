package com.example.parcial1cicloiii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ControlesBasicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.controlesbasicos);

        final EditText tNombre = (EditText)this.findViewById(R.id.etNombre);
        final EditText tApellido = (EditText)this.findViewById(R.id.etApellido);
        Button bDatos = (Button)this.findViewById(R.id.btnEnviar);
// Crear el método Clic para el botón


        bDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
// Crear las variables que reciben los datos
                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();
                String nomComp= nom+" "+ape;

// Primera salida utilizando Toast
                Bundle pasarDatos = new Bundle();

                pasarDatos.putString("cNombre",nomComp);

                Toast.makeText(getApplicationContext(),"Tu nombre es:"+nomComp,Toast.LENGTH_LONG).show();

                Intent siga = new Intent(ControlesBasicos.this, com.example.parcial1cicloiii.IngEdad.class);

                siga.putExtras(pasarDatos);
                startActivity(siga);
            }
        });


    }

}