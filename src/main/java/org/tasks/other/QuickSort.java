package org.tasks.other;

import org.tasks.exceptions.EmptyArrayException;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class QuickSort {



    public static void quickSort(ArrayList<Integer> arr, Integer low, Integer high) throws EmptyArrayException {

        if (arr == null || arr.size() == 0) {
            throw new EmptyArrayException("Array is empty");
        }
        if (low < high) {
            int pi = partition(arr, low, high);


            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    private static int partition(ArrayList<Integer> arr, int low, int high) {
        int medianIndex = medianPivot(arr, low, high);
        swap(arr, medianIndex, high);  // Перемещаем медиану в конец
        Integer pivot = arr.get(high);//select reference point
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                i++;


                Integer temp = arr.get(i); //bufer var
                arr.set(i, arr.get(j));
                arr.set(j,temp);
            }

        }


        Integer temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    private static int medianPivot(ArrayList<Integer> arr, int low, int high) {
        int mid = low + (high - low) / 2;

        if (arr.get(low) > arr.get(mid)) {
            swap(arr, low, mid);
        }
        if (arr.get(mid) > arr.get(high)) {
            swap(arr, mid, high);
        }
        if (arr.get(low) > arr.get(mid)) {
            swap(arr, low, mid);
        }


        return mid;
    }
}



