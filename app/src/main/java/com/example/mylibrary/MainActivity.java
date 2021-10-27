package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLihatSemuaBuku, btnBukuSedangDibaca, btnBacaBuku, btnBukuSudahDibaca, btnTentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setOnClickListeners();

    }

    private void initWidgets(){

        btnLihatSemuaBuku = (Button) findViewById(R.id.btnLihatBuku);
        btnBukuSedangDibaca = (Button) findViewById(R.id.btnBukuSedangDibaca);
        btnBacaBuku = (Button) findViewById(R.id.btnBacaBuku);
        btnBukuSudahDibaca = (Button) findViewById(R.id.btnBukuSudahDibaca);
        btnTentang = (Button) findViewById(R.id.btnTentang);

    }

    private void setOnClickListeners(){

        btnLihatSemuaBuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });

        btnBukuSedangDibaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CurrentlyReadActivity.class);
                startActivity(intent);
            }
        });

        btnBacaBuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WantToReadActivity.class);
                startActivity(intent);
            }
        });

        btnBukuSudahDibaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlreadyReadActivity.class);
                startActivity(intent);
            }
        });


    }

}