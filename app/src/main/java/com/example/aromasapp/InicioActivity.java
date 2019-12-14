package com.example.aromasapp;


import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.view.View;

import java.util.Calendar;

public class InicioActivity extends AppCompatActivity implements View.OnClickListener {
    Button bfechallegada, bfechasalida;
    EditText txtFechallegada, txtFsalida;
    private int anio, mes, dia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        bfechallegada = (Button)findViewById(R.id.bfechallegada);
        txtFechallegada = (EditText)findViewById(R.id.txtFllegada);

        bfechallegada.setOnClickListener(this);
        txtFechallegada.setOnClickListener(this);

        //salida

        bfechasalida = (Button)findViewById(R.id.bfechallesalida);
        txtFsalida = (EditText)findViewById(R.id.txtFsalida);
        bfechasalida.setOnClickListener(this);
        txtFsalida.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == txtFechallegada){
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            anio = c.get(Calendar.YEAR);
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    txtFechallegada.setText(dayOfMonth + "/"+ (month+1) + "/" + year);
                }
            }
                    , dia, mes, anio);
            datePickerDialog.show();
        }
        if (v == txtFsalida){
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            anio = c.get(Calendar.YEAR);
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    txtFsalida.setText(dayOfMonth + "/"+ (month+1) + "/" + year);
                }
            }
                    , dia, mes, anio);
            datePickerDialog.show();
        }
    }
    /*@Override
    public void onClick(View v) {

            Intent o = new Intent(InicioActivity.this, RPasoUnoActivity.class);
            startActivity(o);
    }*/
}
