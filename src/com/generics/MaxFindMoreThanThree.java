package com.generics;

import java.util.Arrays;

public class MaxFindMoreThanThree <T extends Comparable<T>> {  //sorting using comparable interface in collection generic class
    private T[] inputArray;
    MaxFindMoreThanThree(T[] inputArray) { //generics method to accept Type from generics class array
        this.inputArray = inputArray;  //converting into this method object
    }
    public void maxElement() { //accept more than 3 no using array
        for (int i = 0; i < inputArray.length - 1; i++) { //index value of array
            if (inputArray[i].compareTo(inputArray[i + 1]) > 0) {
                inputArray[i + 1] = inputArray[i];
            }
        }
        System.out.println(inputArray[inputArray.length - 1]);
    }
    public void display() {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
        Arrays.sort(inputArray);
        System.out.println("After Sorting");
        for(int i =0; i< inputArray.length ; i++){
            System.out.println(inputArray[i]);
        }
    }
    public static void main(String[] args) {
        Integer[] integer = {56, 30, 70, 123, 43, 56};
        String[] string = {"Peach", "Banana", "Apple", "Orange"};
        Float[] floats = {0.56f, 000000.30f, 7.340f, 0000.01f};
        System.out.println("Integers:-");
        new MaxFindMoreThanThree(integer).display();
        System.out.println("String:-");
        new MaxFindMoreThanThree(string).display();
        System.out.println("Float:-");
        new MaxFindMoreThanThree(floats).display();
        System.out.println("Maximum From Three Value");
        new MaxFindMoreThanThree(integer).maxElement();
        new MaxFindMoreThanThree(string).maxElement();
        new MaxFindMoreThanThree(floats).maxElement();
    }
}
