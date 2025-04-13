package com.example;

import java.util.Arrays;

public class BasicAlgSort<T extends Comparable<? super T>> {

    private int left;
    private int right;
    private T[] array;

    public BasicAlgSort(T[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public BasicAlgSort(int left, int right, T[] array){
        this.left = left;
        this.right = right;
        this.array = Arrays.copyOfRange(array, left, right);
    }

    public T[] getArray() {
        return array;
    }

    public void bubbleSortAsc(){
        boolean flagForInteration = true;
        while (flagForInteration){
            flagForInteration = false;
            for (int i = 1; i < array.length; i++){
                if (array[i].compareTo(array[i-1]) < 0){
                    swap(i, i-1);
                    if (!flagForInteration){
                        flagForInteration = true;
                    }
                }
            }
        }
    }


    private void swap(int leftIndex, int rightIndex){
        T temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

    public void selectionSortAsc(){
        for (int i = 0; i < array.length; i++){
            int minIndex = i;
            T min = array[i];
            for (int j = i + 1; j < array.length; j++){
                if (array[j].compareTo(min) < 0){
                    min = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) swap(i, minIndex);
        }
    }

    public void insertionSortWithLinearSearchAsc(){
        for (int i = 1; i < array.length; i++){
            T key = array[i];
            int j = 1;
            for (; i > 0; j--){
                if (key.compareTo(array[j-1]) < 0){
                    array[j] = array[j - 1];
                }else {
                    break;
                }
            }
            array[j] = key;
        }
    }


    public void insertionSortWithBinarySearchAsc(){
        for (int i = 1; i < array.length; i++){
            T key = array[i];
            int leftIndex = 0;
            int rightIndex = i - 1;
            if (key.compareTo(array[i - 1]) < 0){
                while (leftIndex < rightIndex){
                    int serIndex = (rightIndex + leftIndex) / 2;
                    if (key.compareTo(array[serIndex]) < 0){
                        rightIndex = serIndex;
                    }else {
                        leftIndex = serIndex + 1;
                    }
                }
                for (int j = i; j > leftIndex; j--){
                    array[j] = array[j - 1];
                }
                array[leftIndex] = key;
            }
        }
    }



}
