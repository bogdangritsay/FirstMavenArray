package com.company.arrays;

public class Array {
    //private package it's default
    private double[] array;
    private double max;
    private double min;
    private double mul;
    private double sum;
    private double avg;


    public Array(double[] array, double max) {
        this.array = array;
        this.max = max;
    }
    public Array() {
    }

    public Array(double[] array) {
        this.array = array;
    }

    public double findMaxElement(){
        max = array[0];
        for (int i = 0; i<array.length; i++) {
            if (array[i]> max) {
                max = array[i];
            }
        }
        return max;
    }
    public double findMinElement(){
        min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public double calcSumOfElements(){
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return  sum;
    }
    public double calcMulOfElements(){
        mul = 1;
        for (int i = 0; i < array.length; i++) {
            mul*=array[i];
        }
        return  mul;
    }
    public double calcAvgOfElements(){
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        avg = sum/array.length;
        return  avg;
    }

}











