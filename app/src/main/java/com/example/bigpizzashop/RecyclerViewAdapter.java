package com.example.bigpizzashop;

import android.content.Context;
import android.content.Intent;
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
    Context context;

    class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView nameOfPizza;
        public TextView descriptionOfPizza;
        public TextView priceOfPizza;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = itemView.findViewById(R.id.imageViewOnce);
            nameOfPizza = itemView.findViewById(R.id.nameOfPizzaOnce);
            descriptionOfPizza = itemView.findViewById(R.id.descriptionOfPizzaOnce);
            priceOfPizza = itemView.findViewById(R.id.priceOfPizzaOnce);
        }

        @Override
        public void onClick(View view) {
            Intent pizzaIntent = new Intent(context, PizzaActivity.class);
            int position = getAdapterPosition();
            RecyclerItem recyclerItem = itemArrayList.get(position);
            pizzaIntent.putExtra("Name of pizza", recyclerItem.getNameOfPizza());
            pizzaIntent.putExtra("Description of pizza", recyclerItem.getDescriptionOfPizza());
            pizzaIntent.putExtra("Price of pizza", recyclerItem.getPriceOfPizza());
            pizzaIntent.putExtra("Image", recyclerItem.getImageView());
            pizzaIntent.putExtra("Proteins", recyclerItem.getProteins());
            pizzaIntent.putExtra("Carbohydrates", recyclerItem.getCarbohydrates());
            pizzaIntent.putExtra("Fats", recyclerItem.getFats());
            pizzaIntent.putExtra("CaloricContent", recyclerItem.getCaloricContent());
            context.startActivity(pizzaIntent);
        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerItem> itemArrayList, Context context) {
        this.itemArrayList = itemArrayList;
        this.context = context;
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
