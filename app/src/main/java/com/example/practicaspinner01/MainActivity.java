package com.example.practicaspinner01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView estado;
    Spinner dias_semana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estado = findViewById(R.id.tvestado);
        dias_semana = findViewById(R.id.spinner_dias);

        ArrayList<String> listadeDias = new ArrayList<String>();
        listadeDias.add("Seleccion");
        listadeDias.add("Lunes");
        listadeDias.add("Martes");
        listadeDias.add("Miercoles");
        listadeDias.add("Jueves");
        listadeDias.add("Viernes");
        listadeDias.add("Sábado");
        listadeDias.add("Domingo");

        ArrayAdapter<CharSequence> listadias=new ArrayAdapter(this, android.R.layout.simple_spinner_item,listadeDias);
        dias_semana.setAdapter(listadias);




        dias_semana.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapterView.getItemAtPosition(i).toString().equals("Seleccion"))
                {
                    estado.setText("Aquí aparecerá la opción seleccionada");
                }
                else {
                    Toast.makeText(adapterView.getContext(), "Seleccionado: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                    estado.setText("Día Seleccionado: " + adapterView.getItemAtPosition(i));
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
        /* CÓDIGO USADO PARA CARGAR UNA LISTA DEFINIDA EN UN ARCHIVO DE RECURSOS LLAMADO DIAS_SPINNER

        dias_semana.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                    Toast.makeText(adapterView.getContext(), "Seleccionado: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                    estado.setText("Día Seleccionado: " + adapterView.getItemAtPosition(i));


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        }); */
    }
}
