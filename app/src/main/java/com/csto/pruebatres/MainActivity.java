package com.csto.pruebatres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner ubicacion; Button boton;

    ArrayList<String> lugar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ubicacion = (Spinner)findViewById(R.id.id_spinner);
        boton = (Button)findViewById(R.id.id_boton);

        lugar.add("Paris-Torreifel");
        lugar.add("Santiago-Lamoneda");
        lugar.add("Talca-PlazaDeArmas");

        ArrayAdapter<String> chirino= new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,lugar);
        ubicacion.setAdapter(chirino);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                if(ubicacion.getSelectedItem()==" "){
                    Toast.makeText(getApplicationContext(), "Debe seleccionar",Toast.LENGTH_LONG).show();
                }
                if(ubicacion.getSelectedItem()=="Paris-Torreifel"){
                    Toast.makeText(getApplicationContext(), " seleccionado la torre ifel",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(I);
                }
                if (ubicacion.getSelectedItem()=="Santiago-Lamoneda"){
                    Toast.makeText(getApplicationContext(), "Ah seleccionado la moneda",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(I);
                }
                if(ubicacion.getSelectedItem()=="Talca-PlazaDeArmas"){
                    Toast.makeText(getApplicationContext(),"Ah seleccionado la plaza de armas",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity4.class);
                    startActivity(I);
                }


            }
        }
        );
    }
}