package Algorithm;
import java.util.Scanner;

public class NODandNOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long helperA = a;
        long helperB = b;

        while (helperA > 0 && helperB > 0) {
            if (helperA >= helperB) {
                helperA %= helperB;
            } else {
                helperB %= helperA;
            }
        }

        long GCD = Math.max(helperA, helperB);
        long LCM = (a * b) / GCD;

        System.out.println(GCD + " " + LCM);
        scanner.close();
    }

}