package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;

import TipoJarrones.Clientes;
import TipoJarrones.Jarrones;

public class CalcularJarrones_act extends AppCompatActivity {

    private Spinner jarrones;
    private TextView result;
    private CheckBox jarrones12;
    private CheckBox jarrones24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_jarrones);
        jarrones12 = (CheckBox)findViewById(R.id.cb12jar);
        jarrones24 = (CheckBox)findViewById(R.id.cb24jar);
        jarrones = (Spinner)findViewById(R.id.spnJarrones);
        result = (TextView)findViewById(R.id.tvResult);

        Jarrones jar = new Jarrones();

        String[] ListaJarrones = jar.getJarrones();
        ArrayAdapter adapJarrones = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ListaJarrones);

        jarrones.setAdapter(adapJarrones);


    }
    public void Calcular(View view)
    {
        Clientes cli = new Clientes();

        if (jarrones.getSelectedItem().toString().equals("Ceramica") &&
                jarrones12.isChecked()) {
            result.setText("El precio es: " + cli.calcularPrecioJarrones(4500, 12));
        }
        if (jarrones.getSelectedItem().toString().equals("Porcelana") &&
                jarrones12.isChecked()) {
            result.setText("El precio es: " + cli.calcularPrecioJarrones(12500, 12));
        }
        if (jarrones.getSelectedItem().toString().equals("Vidrio") &&
                jarrones12.isChecked()) {
            result.setText("El precio es: " + cli.calcularPrecioJarrones(25000, 12));
        }
        if (jarrones.getSelectedItem().toString().equals("Ceramica") &&
                jarrones24.isChecked()) {
            result.setText("El precio es:" + cli.calcularPrecioJarrones(4500, 24));
        }
        if (jarrones.getSelectedItem().toString().equals("Porcelana") &&
                jarrones24.isChecked()) {
            result.setText("El precio es:" + cli.calcularPrecioJarrones(12500, 24));
        }
        if (jarrones.getSelectedItem().toString().equals("Vidrio") &&
                jarrones24.isChecked()) {
            result.setText("El precio es:" + cli.calcularPrecioJarrones(25000, 24));
        }
    }
        }


