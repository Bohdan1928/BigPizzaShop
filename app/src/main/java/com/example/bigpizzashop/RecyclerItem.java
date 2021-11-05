package com.example.bigpizzashop;

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

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getNameOfPizza() {
        return nameOfPizza;
    }

    public void setNameOfPizza(String nameOfPizza) {
        this.nameOfPizza = nameOfPizza;
    }

    public String getDescriptionOfPizza() {
        return descriptionOfPizza;
    }

    public void setDescriptionOfPizza(String descriptionOfPizza) {
        this.descriptionOfPizza = descriptionOfPizza;
    }

    public int getPriceOfPizza() {
        return priceOfPizza;
    }

    public void setPriceOfPizza(int priceOfPizza) {
        this.priceOfPizza = priceOfPizza;
    }

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
