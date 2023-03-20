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
    public static String findMaxString(String x, String y, String z){
        int a = x.length();
        int b = y.length();
        int c = z.length();
        System.out.println("a:"+a+" b:"+b+" c:"+c);
        if (a > b && a > c){
            return x;
        } else if (b > c) {
            return y;
        }else{
            return z;
        }
    }
    public static void main(String[] args) {
        System.out.println("Maximum Integer value is :"+ FindMaximumGenerics.findMaxInt(12,13,15));
        System.out.println("Maximum Float value is :"+ FindMaximumGenerics.findMaxFloat(12.12f,13.33f,15.22f));
        System.out.println("Maximum String value is :"+ FindMaximumGenerics.findMaxString("Sharad.","Narute","Pune"));
    }
}
