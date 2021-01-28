package com.example.app_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_titulo = findViewById(R.id.tv_titulo);
        //Recuperar los datos pasados desde el activity
        Bundle datos = getIntent().getExtras();

        String nombre = datos.getString("clave_nombre");
        String apellido = datos.getString("clave_apellido");

        tv_titulo.setText("Bienvenido: "+nombre+" "+apellido);
    }


    public void finalizar(View view){

        finish();
    }

    public void Listado(View view){

        Intent intent = new Intent(this,DatosActivity.class);

        startActivity(intent);

    }

}