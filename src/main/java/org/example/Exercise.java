package org.example;

public class Exercise {
    public int sumRecursively(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumRecursively(n - 1);
    }
    public int sumRecursivelyEven(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 2 * n + sumRecursivelyEven(n - 1);
        }
    }

    public String recursiveStringReverse(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            return s.charAt(s.length() - 1) + recursiveStringReverse(s.substring(0, s.length() - 1));
        }
    }

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            return s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1));
        }
    }
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
