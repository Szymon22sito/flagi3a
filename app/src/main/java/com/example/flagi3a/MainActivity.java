package com.example.flagi3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int licznik = 0;
    private int bledow = 0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void zlaodpowiedz(View view) {
        Toast.makeText(this, "ten kolor jest w fladze Polski", Toast.LENGTH_SHORT).show();
        bledow++;
    }

    public void dobraodpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik == 4){
            textView.setText(R.string.podsumowanie);
        }
    }
}