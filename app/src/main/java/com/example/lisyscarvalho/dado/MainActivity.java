package com.example.lisyscarvalho.dado;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTexto;
    private Button buttomRoleta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void exibir (View v) {

        Random dado1 = new Random();
        Random dado2 = new Random();
        Random dado3 = new Random();
        Random dado4 = new Random();
        Random dado5 = new Random();
        Random dado6 = new Random();

        
    }




}
