package Algorithm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class NearestNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int nearest = arr[0];
        int minDiff = Math.abs(x - nearest); // Находим первоначальную минимальную разницу

        for (int num : arr) {
            int diff = Math.abs(x - num);
            if (diff < minDiff) {
                minDiff = diff;
                nearest = num;
            }
        }
        writer.write(nearest + "");
        writer.close();
    }
}
