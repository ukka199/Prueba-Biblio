package com.example.app_biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Home_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_act);
    }

    public void Libro(View v)
    {
        ArrayList<String> libros = new ArrayList<String>();

        //Segundo commit master

        libros.add("Revival");
        libros.add("Farenheith");
        libros.add("El Alquimista");
        libros.add("El Poder");
        libros.add("Despertar");

        Intent i = new Intent(this, Github_act.class);
        i.putExtra("ListaLibros", libros);
        startActivity(i);
    }
}