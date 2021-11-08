package com.example.bigpizzashop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PizzaActivity extends AppCompatActivity {
    int quantity = 1;
    String nameOfPizza;
    String descriptionOfPizza;
    Intent pizzaIntent;
    int priceOfPizza;
    int image;
    TextView numberOfQuantity;
    TextView textPrice;
    Button buttonAddPizza;
    double proteins;
    double carbohydrates;
    double fats;
    int caloricContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_main);

        pizzaIntent = getIntent();
        addOnScreen();

        ImageView add = findViewById(R.id.addOfQuantity);
        ImageView remove = findViewById(R.id.removeOfQuantity);
        numberOfQuantity = findViewById(R.id.quantity);
        textPrice = findViewById(R.id.price);

        add.setOnClickListener(view -> increaseQuantity());
        remove.setOnClickListener(view -> decreaseQuantity());

        buttonAddPizza = findViewById(R.id.buttonAddPizza);

    }

    public void addOnScreen() {
        nameOfPizza = pizzaIntent.getStringExtra("Name of pizza");
        descriptionOfPizza = pizzaIntent.getStringExtra("Description of pizza");
        priceOfPizza = pizzaIntent.getIntExtra("Price of pizza", 0);
        image = pizzaIntent.getIntExtra("Image", 0);
        proteins = pizzaIntent.getDoubleExtra("Proteins", 0.0);
        carbohydrates = pizzaIntent.getDoubleExtra("Carbohydrates", 0.0);
        fats = pizzaIntent.getDoubleExtra("Fats", 0.0);
        caloricContent = pizzaIntent.getIntExtra("CaloricContent", 0);

        ImageView imageScreen = findViewById(R.id.imageView);
        TextView nameOfPizzaScreen = findViewById(R.id.nameOfPizza);
        TextView descriptionOfPizzaScreen = findViewById(R.id.descriptionOfPizza);
        TextView priceScreen = findViewById(R.id.price);
        TextView quantityProteins = findViewById(R.id.quantityProteins);
        TextView quantityCarbohydrates = findViewById(R.id.quantityCarbohydrates);
        TextView quantityFats = findViewById(R.id.quantityFats);
        TextView quantityCaloricContent = findViewById(R.id.quantityCaloricContent);

        imageScreen.setImageResource(image);
        nameOfPizzaScreen.setText(nameOfPizza);
        priceScreen.setText("" + priceOfPizza);
        descriptionOfPizzaScreen.setText(descriptionOfPizza);
        quantityProteins.setText(proteins + " г");
        quantityCarbohydrates.setText(carbohydrates + " г");
        quantityFats.setText(fats + " г");
        quantityCaloricContent.setText(caloricContent + " ккал");

    }

    public void increaseQuantity() {
        quantity += 1;
        numberOfQuantity.setText(" " + quantity);
        textPrice.setText("" + quantity * priceOfPizza);
    }

    public void decreaseQuantity() {
        quantity -= 1;
        if (quantity == -1) {
            quantity = 0;
        }
        numberOfQuantity.setText(" " + quantity);
        textPrice.setText("" + quantity * priceOfPizza);
    }

    public void addToBasket() {

    }
}
