package com.company;
import java.util.concurrent.RecursiveAction;

public class Quicksort extends RecursiveAction  {
    private int[] array;
    private int low;
    private int high;

    public Quicksort(int[] array)
    {
        this.array = array;
        this.low = 0;
        this.high = array.length - 1;
    }

    public Quicksort(int[] array, int low, int high)
    {
        this.array = array;
        this.low = low;
        this.high = high;
    }


    private int run(int array[],int low,int high){

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

    @Override
    protected void compute(){
        if(low < high){
            int pi = run(array, low, high);
            invokeAll(new Quicksort(array, low, pi-1), new Quicksort(array, pi+1, high));
        }

    }

    //wypisanie tablicy
    public void print(int array[]){
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void print(){
        for(int i=0; i < this.array.length; i++){
            System.out.println(this.array[i]);
        }
    }
    //klasa main obiektu QUICKSORT
    private void quickSort(int array[]){
        int low = 0;
        int high = array.length-1;

        run(array,low,high);
        print(array);

    }
}
