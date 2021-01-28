package com.example.app_02;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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