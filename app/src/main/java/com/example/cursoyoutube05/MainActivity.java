package com.example.cursoyoutube05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv1, iv2, iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
    }

    public void tirar(View v) {
        int valor1 = 1 + (int)(Math.random() * 6);
        int valor2 = 1 + (int)(Math.random() * 6);
        int valor3 = 1 + (int)(Math.random() * 6);

        switch(valor1) {
            case 1: iv1.setImageResource(R.drawable.cara1); break;
            case 2: iv1.setImageResource(R.drawable.cara2); break;
            case 3: iv1.setImageResource(R.drawable.cara3); break;
            case 4: iv1.setImageResource(R.drawable.cara4); break;
            case 5: iv1.setImageResource(R.drawable.cara5); break;
            case 6: iv1.setImageResource(R.drawable.cara6); break;
        }

        switch(valor2) {
            case 1: iv2.setImageResource(R.drawable.cara1); break;
            case 2: iv2.setImageResource(R.drawable.cara2); break;
            case 3: iv2.setImageResource(R.drawable.cara3); break;
            case 4: iv2.setImageResource(R.drawable.cara4); break;
            case 5: iv2.setImageResource(R.drawable.cara5); break;
            case 6: iv2.setImageResource(R.drawable.cara6); break;
        }

        switch(valor3) {
            case 1: iv3.setImageResource(R.drawable.cara1); break;
            case 2: iv3.setImageResource(R.drawable.cara2); break;
            case 3: iv3.setImageResource(R.drawable.cara3); break;
            case 4: iv3.setImageResource(R.drawable.cara4); break;
            case 5: iv3.setImageResource(R.drawable.cara5); break;
            case 6: iv3.setImageResource(R.drawable.cara6); break;
        }
    }
}