package com.generics;

public class FindMaximumGenerics {
    public static <T extends Comparable<T>> T findMaxVal(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }if (c.compareTo(max) > 0) {
            max = c;
        }
            return max;
    }
    public static void main(String[] args) {
        System.out.println("Max from Integer :" + FindMaximumGenerics.findMaxVal(1, 3, 55));
        System.out.println("Max from Float :" + FindMaximumGenerics.findMaxVal(1.2f, 1.44f, 1.76f));
        System.out.println("Max from String :" + FindMaximumGenerics.findMaxVal("Apple", "Mango", "Banana"));
    }
}
