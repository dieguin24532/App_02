package com.example.app_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IngresoActivity extends AppCompatActivity {
    private EditText et_nombre;
    private EditText et_apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        et_nombre = findViewById(R.id.et_nombre);
        et_apellido = findViewById(R.id.et_apellido);

    }

    public void ingresar(View view){
        String nombre = et_nombre.getText().toString();
        String apellido = et_apellido.getText().toString();

        if (!nombre.matches("") && !apellido.matches("")){
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("clave_nombre",nombre);
            intent.putExtra("clave_apellido",apellido);
            //Pasar paramentros a un activity
            startActivity(intent);
        }else{
            Toast.makeText(this,"Los campos no están completos",Toast.LENGTH_LONG).show();
        }
    }
}