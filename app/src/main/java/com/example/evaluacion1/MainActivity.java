package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import TipoJarrones.Jarrones;

public class MainActivity extends AppCompatActivity {
    private Button calculos;
    private EditText usuario;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculos = (Button) findViewById(R.id.btnCalculos);
        usuario = (EditText) findViewById(R.id.etUsuario);
        password = (EditText) findViewById(R.id.etPassword);
        calculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculos = new Intent(MainActivity.this, CalcularJarrones_act.class);
                startActivity(calculos);
            }
        });
    }
    public void Enviar(View view)
    {
        if (usuario.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Campo usuario vacio", Toast.LENGTH_LONG).show();
        } else
            {
            if (password.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Campo password vacio", Toast.LENGTH_LONG).show();
            }else{
                Intent i = new Intent(this, Jarrones_act.class);
                startActivity(i);
            }
        }
    }
}