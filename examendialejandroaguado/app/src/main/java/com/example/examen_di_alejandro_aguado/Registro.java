package com.example.examen_di_alejandro_aguado;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button alerta;

        alerta = (Button)findViewById(R.id.registro);
        alerta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                alertDialog();
            }
        });

        Button info = findViewById(R.id.Login);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Acceso.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    private void alertDialog(){
        new AlertDialog.Builder(this)
                .setTitle("Contraseña")
                .setMessage("Registrado correctamente")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("Mensaje","Cancelado");
                    }
                })
                .show();
    }
}
