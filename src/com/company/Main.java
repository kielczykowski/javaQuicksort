package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //losowa tablica liczb całkowitych
        int size = 100;
        int[] intArray = new int[size];

        Random rand = new Random();
        for (int i=0; i<size; i++){
            intArray[i] = rand.nextInt((100 - 0) + 1) + 0;
            //System.out.println(intArray[i]);
        }

        int[] copiedArray1 = intArray.clone();
        int[] copiedArray2 = intArray.clone();

        //Wywołanie QUICKSORT jednowątkowo
        Quicksort.quickSort(intArray);



    }
}
