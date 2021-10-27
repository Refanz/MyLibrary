package com.example.mylibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class BooksRecyclerViewAdapter extends RecyclerView.Adapter<BooksRecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "BookRecyclerViewAdapter";

    private ArrayList<Book> books = new ArrayList<>();

    private Context context;

    public BooksRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_recycler_books,parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Log.d(TAG, "onBindViewHolder: called ");
        holder.titleBook.setText(books.get(position).getJudulBuku());
        holder.cardBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookActivity.class);
                intent.putExtra("id", books.get(position).getId());
                context.startActivity(intent);
            }
        });

        Glide.with(context)
                .asBitmap()
                .load(books.get(position).getImageUrl())
                .into(holder.imgBook);
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private static final String TAG = "BookRecyclerViewAdapter";

        private ImageView imgBook;
        private TextView titleBook;
        private CardView cardBook;
        private TextView publisher;
        private TextView datePublisher;
        private TextView pagesBook;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBook = (ImageView) itemView.findViewById(R.id.imgBook);
            titleBook = (TextView) itemView.findViewById(R.id.txtjudulBuku);
            cardBook = (CardView) itemView.findViewById(R.id.cardBook);
            publisher = (TextView) itemView.findViewById(R.id.penerbitBuku);
            datePublisher = (TextView) itemView.findViewById(R.id.tanggalTerbit);
            pagesBook = (TextView) itemView.findViewById(R.id.jumlahHalamanBuku);
        }
    }

    public void setBook(ArrayList<Book> books){
        this.books = books;
        notifyDataSetChanged();
    }

}
