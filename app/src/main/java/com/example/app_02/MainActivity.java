package com.example.app_02;

import androidx.annotation.Nullable;
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
    private int codigo_requerido = 1;

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

        startActivityForResult(intent,codigo_requerido);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode==codigo_requerido) && (resultCode==RESULT_OK)){

            tv_titulo.setText("El dato selccionado es: "+ data.getDataString());

        }
    }
}