package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button btPenjumlahan, btPengurangan, btPerkalian, btPembagian;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.editTextNumber1);
        et2=(EditText) findViewById(R.id.editTextNumber2);
        tvHasil=(TextView) findViewById(R.id.textViewHasil);

        btPenjumlahan=(Button) findViewById(R.id.buttonPenjumlahan);
        btPengurangan=(Button) findViewById(R.id.buttonPerkurangan);
        btPerkalian=(Button) findViewById(R.id.buttonPerkalian);
        btPembagian=(Button) findViewById(R.id.buttonPembagian);

        btPenjumlahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, Hasil;
                bil1=Double.valueOf(et1.getText().toString(). trim());
                bil2=Double.valueOf(et2.getText().toString(). trim());
                Hasil =bil1+bil2;
                String hasil=String.valueOf(Hasil);
                tvHasil.setText(hasil);
            }
        });

        btPengurangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, Hasil;
                bil1=Double.valueOf(et1.getText().toString(). trim());
                bil2=Double.valueOf(et2.getText().toString(). trim());
                Hasil =bil1-bil2;
                String hasil=String.valueOf(Hasil);
                tvHasil.setText(hasil);
            }
        });

        btPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, Hasil;
                bil1=Double.valueOf(et1.getText().toString(). trim());
                bil2=Double.valueOf(et2.getText().toString(). trim());
                Hasil =bil1*bil2;
                String hasil=String.valueOf(Hasil);
                tvHasil.setText(hasil);
            }
        });

        btPembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, Hasil;
                bil1=Double.valueOf(et1.getText().toString(). trim());
                bil2=Double.valueOf(et2.getText().toString(). trim());
                Hasil =bil1/bil2;
                String hasil=String.valueOf(Hasil);
                tvHasil.setText(hasil);
            }
        });

    }
}