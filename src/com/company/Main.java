package com.company;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {
        //losowa tablica liczb całkowitych
        int size = 5000000;
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
        long startTime = System.nanoTime();
        fjp.invoke(qs);

        fjp.shutdown();

        long endTime   = System.nanoTime();

        // System.out.println("After Sort: ");
        // qs.print();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
