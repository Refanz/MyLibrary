package com.example.mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {
    private static final String TAG = "Book Activity";

    private TextView judulBuku, pengarangBuku, deskripsiBuku, penerbitBuku, tanggalTerbitBuku, jumlahHalamanBuku;
    private ImageView gambarBuku;
    private Button btnAlreadyRead, btnCurrentlyReading, btnWantToRead;
    private Book incomingBook;
    private Util util;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initWidget();

        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        util = new Util();
        ArrayList<Book> books = util.getAllBooks();

        for(Book b : books){

            if(b.getId() == id){
                incomingBook = b;
                judulBuku.setText(b.getJudulBuku());
                pengarangBuku.setText(b.getAuthor());
                deskripsiBuku.setText(b.getDescription());
                penerbitBuku.setText(b.getPenerbit());
                tanggalTerbitBuku.setText(b.getTanggalTerbit());
                jumlahHalamanBuku.setText(String.valueOf(b.getPages()));

                Glide.with(this)
                        .asBitmap()
                        .load(b.getImageUrl())
                        .into(gambarBuku);
            }

        }

        btnCurrentlyReading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCurrentlyReadingTapped();
            }
        });

        btnAlreadyRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnAlreadyReadTapped();
            }
        });

        btnWantToRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnWantToReadTapped();
            }
        });
    }

    private void btnWantToReadTapped(){
        Log.d(TAG, "onClick : btnWantToReadTapped : started ");

        boolean doesExist = false;
        ArrayList<Book> wantToReadBook = util.getWantToReadBooks();
        for(Book b : wantToReadBook){
            if(b.getId() == incomingBook.getId()){
                doesExist = true;
            }
        }
        if(doesExist){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("You Already Added This Book To Your Want To Read List");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.create().show();
        }else{
            util.addWantToReadBooks(incomingBook);
            Toast.makeText(this, "The Book " + incomingBook.getJudulBuku(), Toast.LENGTH_SHORT).show();
        }
    }

    private void btnAlreadyReadTapped(){
        Log.d(TAG, "onClick : btnAlreadyReadTapped : started");

        boolean doesExist = false;
        ArrayList<Book> alreadyReadBook = util.getAlreadyReadBooks();
        for(Book b : alreadyReadBook){
            if(b.getId() == incomingBook.getId()){
                doesExist = true;
            }
        }
        if(doesExist){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("You Already Added This Book To Your Already Read List");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setCancelable(false);
            builder.create().show();
        }else{
            util.addAlreadyReadBooks(incomingBook);
            Toast.makeText(this, "The Book " + incomingBook.getJudulBuku(), Toast.LENGTH_SHORT).show();
        }
    }

    private void btnCurrentlyReadingTapped(){
        Log.d(TAG, "onClick : btnCurrentlyReadingTapped : started");

        boolean doesExist = false;
        ArrayList<Book> currentlyReadingBook = util.getCurrentlyReadingBooks();
        for(Book b : currentlyReadingBook){
            if (b.getId() == incomingBook.getId()){
                doesExist = true;
            }
        }
            if(doesExist){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("You Already Added This Book To Your Currently Reading List");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setCancelable(false);
                builder.create().show();
            }else{
                util.addCurrentlyReadingBook(incomingBook);
                Toast.makeText(this, "The Book " + incomingBook.getJudulBuku(), Toast.LENGTH_SHORT).show();
            }
    }

    private void initWidget(){
        judulBuku = (TextView) findViewById(R.id.judulBuku);
        pengarangBuku = (TextView) findViewById(R.id.pengarangBuku);
        gambarBuku = (ImageView) findViewById(R.id.gambarBuku);
        deskripsiBuku = (TextView) findViewById(R.id.deskripsiBuku);
        penerbitBuku = (TextView) findViewById(R.id.penerbitBuku);
        tanggalTerbitBuku = (TextView) findViewById(R.id.tanggalTerbit);
        jumlahHalamanBuku = (TextView) findViewById(R.id.jumlahHalamanBuku);
        btnAlreadyRead = (Button) findViewById(R.id.btnAlreadyRead);
        btnCurrentlyReading = (Button) findViewById(R.id.btnCurrentlyReading);
        btnWantToRead = (Button) findViewById(R.id.btnWantToRead);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                super.onBackPressed();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}