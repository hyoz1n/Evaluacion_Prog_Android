package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import TipoJarrones.Clientes;
import TipoJarrones.Jarrones;

public class Jarrones_act extends AppCompatActivity {
    private Spinner jarrones;
    private Spinner clientes;
    private TextView result;
    private TextView adicional;
    private RatingBar rating;
    private Button botonF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarrones);
        jarrones = (Spinner) findViewById(R.id.spinnerJarrones);
        clientes = (Spinner) findViewById(R.id.spinnerClientes);
        result = (TextView) findViewById(R.id.tvResultadoFinal);
        adicional = (TextView) findViewById(R.id.tvAdicional);
        rating = (RatingBar) findViewById(R.id.rb);
        botonF = (Button) findViewById(R.id.btnCalcularF);
        Clientes cli = new Clientes();
        String[] ListaClientes = cli.getClientes();
        ArrayAdapter adapClientes = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ListaClientes);
        clientes.setAdapter(adapClientes);
        Jarrones jar = new Jarrones();
        String[] ListaJarrones = jar.getJarrones();
        ArrayAdapter adapJarrones = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ListaJarrones);
        jarrones.setAdapter(adapJarrones);
    }

    public void Calcular(View view) {
        String calificacion = "Con un total de: " + rating.getNumStars() + " Estrellas";
        String rtng = "Usted calificó la mano de obra con: " + rating.getRating();
        Toast.makeText(getApplicationContext(), calificacion + "\n" + rtng, Toast.LENGTH_LONG).show();
        Clientes cli = new Clientes();
        if (jarrones.getSelectedItem().toString().equals("Ceramica") &&
                clientes.getSelectedItem().toString().equals("Sermieh")) {
            result.setText("El precio es: " + cli.resultadoFinalJarron(4500, 150));
            adicional.setText("El adicional es 150");
        } else if (jarrones.getSelectedItem().toString().equals("Porcelana") &&
                clientes.getSelectedItem().toString().equals("Sermieh")) {
            result.setText("El precio es: " + cli.resultadoFinalJarron(12500, 350));
            adicional.setText("El adicional es 350");
        } else if (jarrones.getSelectedItem().toString().equals("Vidrio") &&
                clientes.getSelectedItem().toString().equals("Sermieh")) {
            result.setText("El precio es: " + cli.resultadoFinalJarron(25000, 500));
            adicional.setText("El adicional es 500");
        } else if (jarrones.getSelectedItem().toString().equals("Ceramica") &&
                clientes.getSelectedItem().toString().equals("Jacinta")) {
            result.setText("El precio es: " + cli.resultadoFinalJarron(4500, 150));
            adicional.setText("El adicional es 150");
        } else if (jarrones.getSelectedItem().toString().equals("Porcelana") &&
                clientes.getSelectedItem().toString().equals("Jacinta")) {
            result.setText("El precio es: " + cli.resultadoFinalJarron(12500, 350));
            adicional.setText("El adicional es 350");
        } else if (jarrones.getSelectedItem().toString().equals("Vidrio") &&
                clientes.getSelectedItem().toString().equals("Jacinta")) {
            result.setText("El precio es: " + cli.resultadoFinalJarron(25000, 500));
            adicional.setText("El adicional es 500");
        }
    }

}


