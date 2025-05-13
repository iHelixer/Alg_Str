package com.example;

import java.util.Arrays;

public class CountingSort {
    private int[] array;

    public CountingSort(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return array;
    }

    public void countSort() {
        int max = Arrays.stream(array).max().getAsInt();
        int[] count = new int[max + 1];

        for (int num : array) {
            count[num]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        array = Arrays.copyOf(sortedArray, sortedArray.length);
    }

    public void radixSort() {
        int max = Arrays.stream(array).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            int[] sortedArray = countSortForRadix(exp);
            array = Arrays.copyOf(sortedArray, sortedArray.length);
        }
    }

    private int[] countSortForRadix(int exp) {
        int[] count = new int[10];
        int[] sortedArray = new int[array.length];

        for (int num : array) {
            count[(num / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int index = (array[i] / exp) % 10;
            sortedArray[count[index] - 1] = array[i];
            count[index]--;
        }

        return sortedArray;
    }
}