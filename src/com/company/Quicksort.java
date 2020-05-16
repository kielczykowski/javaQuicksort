package com.company;

public class Quicksort {
    static int run(int array[],int low,int high){

        int pivot = array[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(array[j] < pivot){
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }


    static void sort(int array[], int low, int high){
        if(low < high){
            int pi = run(array, low, high);
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }

    }

    //wypisanie tablicy
    static void print(int array[]){
        System.out.println("SORTED: ");
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    //klasa main obiektu QUICKSORT
    static void quickSort(int array[]){
        int low = 0;
        int high = array.length-1;

        sort(array,low,high);
        print(array);

    }
}
