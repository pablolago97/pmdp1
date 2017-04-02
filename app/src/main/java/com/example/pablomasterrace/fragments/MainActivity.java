package com.example.pablomasterrace.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int REQUEST_CODE = 1;
    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText)findViewById(R.id.texto);
    }

    //Metodo para invocar a la otra 'activity'
    public void llamar_activity(View v){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("texto", texto.getText().toString());
        startActivityForResult(i, REQUEST_CODE);
    }
}
