package com.company;

import com.company.arrays.Array;

import java.util.Scanner;

public class Main {
    // в статическом контексте можно работать либо
// со статическими методами и полями или же создавая объект
    public static void main(String[] args) {
        run();
    }


    private  static void  run() {
        System.out.println("Hello. It's programm  for work with array! Welcome! ");
        Scanner in = new Scanner(System.in);
       /*  //создание динамического массива
        System.out.println("Enter the number of array elements: ");
        int numbElem = in.nextInt();*/
        double massiv[] = {70.3, 400, 5, 0.005, -0.456, 46, -5};

        Array object1 = new Array(massiv);

        System.out.println("Select what you want to see: \n\t " +

                "1 - Maximal element of array\n\t " +
                "2 - Minimal element of array\n\t " +
                "3 - Calculate the average value of array elements\n\t" +
                "4 - Calculate the summary of array elements\n\t" +
                "5 - Calculate the multiplication of array elements\n" +
                "Type the number of choice: ");


        int choice = in.nextInt();      // здесь нужно сделать проверку на Exception

        switch (choice) {
            case (1):
                System.out.println("Max element of array: " + object1.findMaxElement());
                break;
            case (2):
                System.out.println("Min element of array: " + object1.findMinElement());
                break;
            case (3):
                System.out.println("Calculated  average value of array elements: " + object1.calcAvgOfElements());
                break;
            case (4):
                System.out.println("Calculated summary of array elements: " + object1.calcSumOfElements());
                break;
            case (5):
                System.out.println("Calculated multiplication of array elements: " + object1.calcMulOfElements());
                break;
            default:
                System.out.println("Error of select!");
                break;
        }
    }
}
