package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static ArrayList<Integer> quicksort(ArrayList<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            int pivot = array.get(0);
            ArrayList<Integer> listLess = new ArrayList<>();
            ArrayList<Integer> listGreater = new ArrayList<>();
            for (int i : array) {
                if (i < pivot) {
                    listLess.add(i);
                }
                if (i > pivot) {
                    listGreater.add(i);
                }
            }
            ArrayList<Integer> overallList = new ArrayList<>();
            overallList.addAll(quicksort(listLess));
            overallList.add(pivot);
            overallList.addAll(quicksort(listGreater));
            return overallList;
        }
    }

    /*public static void quicksort(int[] arr, int start, int end) {

        if(arr != null && arr.length <= 1) {
            return;
        }

        if (start < end) {

            int pivotIndex = partition(arr, start, end);
            quicksort(arr, start, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i = start;
        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, start, i);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/

    public static void quicksort(int[] arr, int start, int end) {
        if (arr != null && arr.length < 1) {
            return;
        }
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quicksort(arr, start, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, start, i);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 2, 3, -5, 9, 4, 3};
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        ArrayList<Integer> test2 = new ArrayList<>();
            test2.add(10);
            test2.add(10);
            test2.add(2);
            test2.add(3);
            test2.add(-5);
            test2.add(9);
            test2.add(4);
            test2.add(3);
        System.out.println(quicksort(test2));
    }
}
