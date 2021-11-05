package com.example.bigpizzashop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private ArrayList<RecyclerItem> itemArrayList;

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView nameOfPizza;
        public TextView descriptionOfPizza;
        public TextView priceOfPizza;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameOfPizza = itemView.findViewById(R.id.nameOfPizza);
            descriptionOfPizza = itemView.findViewById(R.id.descriptionOfPizza);
            priceOfPizza = itemView.findViewById(R.id.priceOfPizza);
        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerItem> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_recipes, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        RecyclerItem recyclerItem = itemArrayList.get(position);

        holder.imageView.setImageResource(recyclerItem.getImageView());
        holder.nameOfPizza.setText(recyclerItem.getNameOfPizza());
        holder.descriptionOfPizza.setText(recyclerItem.getDescriptionOfPizza());
        int price = recyclerItem.getPriceOfPizza();
        holder.priceOfPizza.setText(" " + price);
    }

    @Override
    public int getItemCount() {
       return itemArrayList.size();
    }
}
