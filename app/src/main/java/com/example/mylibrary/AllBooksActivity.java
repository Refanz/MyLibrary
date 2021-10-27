package com.example.mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import java.util.ArrayList;


public class AllBooksActivity extends AppCompatActivity {

    private static final String TAG = "AllBooksActivity";

    private RecyclerView rvBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        Log.d(TAG, "onCreate: ");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvBooks = (RecyclerView) findViewById(R.id.rvBooks);

        BooksRecyclerViewAdapter adapter = new BooksRecyclerViewAdapter(this);

        rvBooks.setAdapter(adapter);
        rvBooks.setLayoutManager(new GridLayoutManager(this, 2));

        Util util = new Util();
        ArrayList<Book> books;
        books = util.getAllBooks();
        adapter.setBook(books);
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