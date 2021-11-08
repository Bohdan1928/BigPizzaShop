package com.example.bigpizzashop;

import androidx.annotation.NonNull;

public class RecyclerItem {
    private int imageView;
    private String nameOfPizza;
    private String descriptionOfPizza;
    private int priceOfPizza;
    private double proteins;
    private double carbohydrates;
    private double fats;
    private int caloricContent;

    public RecyclerItem() {
    }

    public RecyclerItem(int imageView, String nameOfPizza, String descriptionOfPizza, int priceOfPizza, double proteins, double carbohydrates, double fats, int caloricContent) {
        this.imageView = imageView;
        this.nameOfPizza = nameOfPizza;
        this.descriptionOfPizza = descriptionOfPizza;
        this.priceOfPizza = priceOfPizza;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.caloricContent = caloricContent;
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

    public double getProteins() {
        return proteins;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public int getCaloricContent() {
        return caloricContent;
    }

    @Override
    public String toString() {
        return "RecyclerItem{" +
                "imageView=" + imageView +
                ", nameOfPizza='" + nameOfPizza + '\'' +
                ", descriptionOfPizza='" + descriptionOfPizza + '\'' +
                ", priceOfPizza=" + priceOfPizza +
                ", proteins=" + proteins +
                ", carbohydrates=" + carbohydrates +
                ", fats=" + fats +
                ", caloricContent=" + caloricContent +
                '}';
    }
}
