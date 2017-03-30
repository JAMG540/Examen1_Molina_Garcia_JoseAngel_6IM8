package com.example.jamg54.examen1_molina_garcia_joseangel_6im8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity {

    EditText cantidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidad=(EditText) findViewById(R.id.cantidad);
    }

    public void onClickConvertir (View param) {


        try {

            if(!cantidad.getText().toString().equals(""))

            {
                Intent llamada = new Intent(this, Actividad2.class );

                Double numero = Double.parseDouble(cantidad.getText().toString());

                Double resultado = numero / 15;

                Bundle parametros = new Bundle();

                parametros.putDouble("resultado", resultado);

                llamada.putExtras(parametros);

                finish();

                startActivity(llamada);

            }else{
                Toast.makeText(this, "Ingresa un numero", LENGTH_SHORT).show();
            }
        } catch (Exception e) {

            Toast.makeText(this, "Ingresa datos válidos", LENGTH_SHORT).show();
        }

    }
}
