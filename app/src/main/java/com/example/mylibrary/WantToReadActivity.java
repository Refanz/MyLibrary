 package com.example.mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

 public class WantToReadActivity extends AppCompatActivity {

    private Util util;
    private RecyclerView recyclerView;
    private BooksRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_want_to_read);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        adapter = new BooksRecyclerViewAdapter(this);
        util = new Util();

        recyclerView = (RecyclerView) findViewById(R.id.recViewWantToRead);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        adapter.setBook(util.getWantToReadBooks());
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