package BookPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class lambdaFunctions {
    public static void main(String[] args) {
        int[] arr = new int[10];
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(54, 35,6,64,23,4));
        list.forEach(s -> System.out.println(s));
    }
}
