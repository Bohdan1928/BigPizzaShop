package com.example.bigpizzashop;

import androidx.annotation.NonNull;

public class RecyclerItem {
    private int imageView;
    private String nameOfPizza;
    private String descriptionOfPizza;
    private int priceOfPizza;

    public RecyclerItem() {
    }

    public RecyclerItem(int imageView, String nameOfPizza, String descriptionOfPizza, int priceOfPizza) {
        this.imageView = imageView;
        this.nameOfPizza = nameOfPizza;
        this.descriptionOfPizza = descriptionOfPizza;
        this.priceOfPizza = priceOfPizza;
    }

    public int getImageView() {
        return imageView;
    }

    public String getNameOfPizza() {
        return nameOfPizza;
    }

    public String getDescriptionOfPizza() {
        return descriptionOfPizza;
    }

    public int getPriceOfPizza() {
        return priceOfPizza;
    }

    @NonNull
    @Override
    public String toString() {
        return "RecyclerItem{" +
                "imageView=" + imageView +
                ", nameOfPizza='" + nameOfPizza + '\'' +
                ", descriptionOfPizza='" + descriptionOfPizza + '\'' +
                ", priceOfPizza=" + priceOfPizza +
                '}';
    }
}
