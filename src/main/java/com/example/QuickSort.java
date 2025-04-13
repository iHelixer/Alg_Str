package com.example;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> {
    T[] array;
    public QuickSort(T[] array){
        this.array = Arrays.copyOf(array, array.length);
    }

    public T[] getArray(){
        return array;
    }

    public void quickSortArray(int first, int last){
        if (first < last){
            int pivotElementIndex = partition(first, last);
            quickSortArray(first, pivotElementIndex - 1);
            quickSortArray(pivotElementIndex + 1, last);
        }
    }

    private int partition(int first, int last){
        T pivotElement = array[last];
        int i = first - 1;
        for (int j = first; j < last; j++){
            if (array[j].compareTo(pivotElement) <= 0){
                i++;
                if (i != j){
                    swap(i, j);
                }
            }
        }
        swap(i + 1, last);
        return i + 1;
    }

    private void swap(int i, int j){
        T firstElement = array[i];
        array[i] = array[j];
        array[j] = firstElement;
    }



}
