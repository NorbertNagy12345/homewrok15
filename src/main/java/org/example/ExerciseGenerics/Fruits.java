package org.example.ExerciseGenerics;

public class Fruits implements ShopItem{
    String name;
    int price;
    Category category;

    public Fruits(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public Category category() {
        return this.category;
    }
}
