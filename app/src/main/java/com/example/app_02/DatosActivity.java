package com.example.app_02;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DatosActivity extends AppCompatActivity {
    private ListView lv_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        //
        lv_datos = findViewById(R.id.lv_datos);


        //Crear datos para asociar al ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,recuperarDatosListView());

        lv_datos.setAdapter(adapter);
        //Asociar un listenet
        lv_datos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            //Recuperar el item seleccionado
                String seleccionado = lv_datos.getAdapter().getItem(position).toString();
                //
                //Toast.makeText(getApplicationContext(),"Has seleccionado el valor"+seleccionado,Toast.LENGTH_LONG).show();
                //Regresar el valor del intent
                Intent intent = new Intent();
                intent.setData(Uri.parse(seleccionado));

                //indicar todo bien
                setResult(Activity.RESULT_OK, intent);

                //Cerrar el activity
                finish();

            }
        });
    }

    private List<String> recuperarDatosListView() {
        List<String> retornar = new ArrayList<String>();

        for (int i=1; i<=25;i++){
            String valor = "Valor "+i;
            retornar.add(valor);
        }

        return retornar;
    }


}