package com.ahiralabata.ahirainputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama, alamat;
    Button simpan, reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        simpan = findViewById(R.id.simpan);
        reset = findViewById(R.id.reset);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nama.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Silakan Masukan Nama", Toast.LENGTH_LONG).show();
                    nama.requestFocus();
                }else if(alamat.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Silakan Masukan Alamat", Toast.LENGTH_LONG).show();
                    alamat.requestFocus();
                }else {
                    Toast.makeText(MainActivity.this, "Selamat datang "+ nama.getText() + "yang beralamat di " + alamat.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void reset(View view) {
        nama.setText("");
        alamat.setText("");
        nama.requestFocus();
    }
}