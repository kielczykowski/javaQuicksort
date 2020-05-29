package com.company;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {
        //losowa tablica liczb całkowitych
        int size = 10000000;
        int[] intArray = new int[size];

        Random rand = new Random();
        for (int i=0; i<size; i++){
            intArray[i] = rand.nextInt();
            //System.out.println(intArray[i]);
        }
        Quicksort qs = new Quicksort(intArray);
        // System.out.println("Before Sort: ");
        // qs.print();

        ForkJoinPool fjp = new ForkJoinPool();
        fjp.invoke(qs);

        fjp.shutdown();

        // System.out.println("After Sort: ");
        // qs.print();


    }
}
