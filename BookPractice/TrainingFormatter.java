package BookPractice;

import java.util.Date;

public class TrainingFormatter {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(String.format("%,7.2f", 43.2543));
        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format("%tA, %<tB, %<td", today));
        System.out.printf("%-d", 1000000);
    }
}
