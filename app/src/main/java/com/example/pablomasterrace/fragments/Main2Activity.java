package com.example.pablomasterrace.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private String texto;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Recibe intent de ActivityMain (1)
        i = getIntent();
        Bundle extras = i.getExtras();
        texto = extras.getString("texto");
        View fragment = findViewById(R.id.fragment_confirmacion);
        TextView confirmacion_txt = (TextView) fragment.findViewById(R.id.confirmacion);
        confirmacion_txt.setText("Has escrito " + texto);
    }

    public void aceptar(View v) {
        i.putExtra("RESULTADO", texto);
        setResult(RESULT_OK, i);
        finish();//Sale del programa
    }

    public void cancelar(View v){
        setResult(RESULT_CANCELED);
        finish();//SAle del programa
    }


}
