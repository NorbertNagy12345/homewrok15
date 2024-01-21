package org.example;

import org.example.ExerciseGenerics.Category;
import org.example.ExerciseGenerics.Clothes;

public class Main {
    public static void main(String[] args) {
        ExerciseRecursively exercise = new ExerciseRecursively();

        System.out.println(exercise.sumRecursively(5));
        System.out.println(exercise.sumRecursivelyEven(6));

        System.out.println(exercise.recursiveStringReverse("homework"));
        System.out.println(exercise.isPalindrome("madam"));
        System.out.println(exercise.isPalindrome("homework"));

        System.out.println(exercise.fibonacci(7));

        Clothes clothes = new Clothes("Jeans", 20, Category.NEW);


    }
}