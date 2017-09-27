package com.example.satellite.tallerclasedos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearCelulares extends AppCompatActivity {

    private EditText marca,capacidad, precio, color, SistemaOperativo;
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celulares);

        marca = (EditText)findViewById(R.id.TextMarca);
        capacidad = (EditText)findViewById(R.id.TextCapacidad);
        precio= (EditText)findViewById(R.id.TextPrecio);
        color= (EditText)findViewById(R.id.TextColor);
        SistemaOperativo = (EditText)findViewById(R.id.TxtSistemaOperativo);

        resources = this.getResources();
    }

    public void guardar(View view){
        String marc,cap,prec,col, sis;

        marc = marca.getText().toString();
        cap = capacidad.getText().toString();
        prec = precio.getText().toString();
        col = color.getText().toString();
        sis = SistemaOperativo.getText().toString();

        Celular c = new Celular(marc,cap,prec,col,sis);
        c.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();
    }
}
