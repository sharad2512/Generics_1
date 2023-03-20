package com.generics;

public class FindMaximumGenerics {
    public static Integer findMaxInt(Integer a, Integer b, Integer c){
        if (a > b && a > c){
            return a;
        } else if (b > c ) {
            return b;
        }else {
            return c;
        }
    }
    public static Float findMaxFloat(Float a, Float b, Float c){
        if (a > b && b > c){
            return a;
        } else if (b > c) {
            return b;
        }else {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println("Maximum Integer value is :"+ FindMaximumGenerics.findMaxInt(12,13,15));
        System.out.println("Maximum Integer value is :"+ FindMaximumGenerics.findMaxFloat(12.12f,13.33f,15.22f));
    }
}
