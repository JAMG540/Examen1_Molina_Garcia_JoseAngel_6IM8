package com.example.jamg54.examen1_molina_garcia_joseangel_6im8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    TextView etiqueta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        try {

            etiqueta= (TextView) findViewById(R.id.resultado);

            Bundle recibir=new Bundle();

            recibir=this.getIntent().getExtras();

            Double recibido=recibir.getDouble("resultado");

            etiqueta.setText("Molina Garcia Jose Ángel" +"  "+recibido);

        }catch (Exception e)
        {
            etiqueta.setText(e.getMessage());
        }
    }


    public void onClickEnviar(View env)
    {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "EXAMEN 1er PARCIAL");
            intent.putExtra(Intent.EXTRA_TEXT, etiqueta.getText().toString());
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"eoropezag@ipn.mx"});
            startActivity(intent);
        }catch (Exception e)
        {

            etiqueta.setText(e.getMessage());

        }
    }
}
