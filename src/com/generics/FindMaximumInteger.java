package com.generics;

public class FindMaximumInteger {
    public static Integer compareTo(Integer a, Integer b, Integer c){
        if (a > b && a > c){
            return a;
        } else if (b > c ) {
            return b;
        }else {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println("Maximum Integer value is :"+FindMaximumInteger.compareTo(12,13,15));
    }
}
