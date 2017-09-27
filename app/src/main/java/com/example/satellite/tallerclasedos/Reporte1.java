package com.example.satellite.tallerclasedos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableRow;

public class Reporte1 extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Celular> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte1);

        tabla = (TableLayout)findViewById(R.id.tabla);
        celulares = Datos.obtener();

        for (int i = 0; i <celulares.size() ; i++) {
            TableRow fila = new TableRow(this);

            if(celulares.get(i).getMarca().equalsIgnoreCase("Samsung") && celulares.get(i).getColor().equalsIgnoreCase("Negro")&& celulares.get(i).SistemaOperativo.equalsIgnoreCase("Andorid"))){
                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);
                TextView c5 = new TextView(this);
                TextView c6 = new TextView(this);

                c1.setText(""+(i+1));
                c2.setText(Celular.get(i).getMarca());
                c3.setText(Celular.get(i).getCapacidad());
                c4.setText(Celular.get(i).getPrecio());
                c5.setText(Celular.get(i).getColor());
                c5.setText(Celular.get(i).getSistemaOperativo());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);
                fila.addView(c6);

                tabla.addView(fila);
            }



        }


    }
}
