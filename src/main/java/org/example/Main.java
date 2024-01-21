package org.example;

public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();

        System.out.println(exercise.sumRecursively(5));
        System.out.println(exercise.sumRecursivelyEven(6));

        System.out.println(exercise.recursiveStringReverse("homework"));
        System.out.println(exercise.isPalindrome("madam"));
        System.out.println(exercise.isPalindrome("homework"));

        System.out.println(exercise.fibonacci(7));


    }
}