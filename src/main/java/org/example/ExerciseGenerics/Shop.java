package org.example.ExerciseGenerics;

import java.util.List;

public class Shop <T extends ShopItem>{
    public void addItem(T item){

    };

    public List<T> findByCategory(Category cat){
return null;
    };
    public List<T> findWithLowerPrice(int maxPrice){
return null;
    };

    public T findByName(String name){
return null;
    };

   public T removeItem(String name){
        return null;
    };
}