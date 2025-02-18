package Algorithm;

import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.swap;

public class SelectionSort {
/*    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int[] selectionSort(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int smallest = findSmallest(arr);
            newArr[i] = arr[smallest];
        }
        return newArr;
    }*/

    /*public static void main(String[] args) {
        *//*for (int x : selectionSort(new int[]{5, 3, 6, 2, 10})) {
            System.out.print(x + " ");
        }*//*
    }*/
    static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // main function
    public static void main(String args[])
    {
        int arr[] = { 64, 25, 12, 22, 11 };

        sort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
