package DifTopics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        System.out.println(equation);
        double[] abs = new double[4];
        for (String ab : equation.split("x")) {
            abs[i] = Double.parseDouble((ab));
            System.out.print(abs[i] + " ");
            i++;
        }
        if (Math.abs(abs[0]) == Math.abs(abs[abs.length - 1]) && Math.abs(abs[1]) == Math.abs(abs[2])) {
            System.out.println(" <-- Уравнение подходит!");
        } else {
            System.out.println(" <-- Уравнение не подходит");
            return;
        }

        double a = abs[0];
        double b = abs[1];


        if (abs[0] == abs[abs.length - 1] && abs[1] == abs[2]) {
            double d = Math.pow(b, 2) - (2 * a * b) - 3 * Math.pow(a, 2);
            double discriminant = Math.sqrt(d);
            System.out.println("\nУравнение первого вида!\n");
            System.out.println("D = √(" + Math.pow(b, 2) + "-" + 2 * a * b + "-" + 3 * Math.pow(a, 2) + ") = √(" + d + ")\n");
            double x1 = (-(b - a) + discriminant) / 2 * a;
            System.out.println("x1 = (-(" + b + "-" + a + ")+" + "√(" + d + ")" + ")/" + 2 * a + " = (" + -(b - a) + "+√(" + d + "))/" + 2 * a);
            System.out.println("x1 = " + x1 + "\n");
            double x2 = (-(b - a) - discriminant) / 2 * a;
            System.out.println("x2 = (-(" + b + "-" + a + ")-" + "√(" + d + ")" + ")/" + 2 * a + " = (" + -(b - a) + "-√(" + d + "))/" + 2 * a);
            System.out.println("x2 = " + x2 + "\n");
            System.out.println("x3 = -1");
        } else {
            double d = Math.pow(b, 2) + (2 * a * b) - 3 * Math.pow(a, 2);
            double discriminant = Math.sqrt(d);
            System.out.println("\nУравнение второго вида!\n");
            System.out.println("D = √(" + Math.pow(b, 2) + "+" + 2 * a * b + "-" + 3 * Math.pow(a, 2) + ") = √(" + d + ")\n");
            double x1 = (-(b + a) + discriminant) / 2 * a;
            System.out.println("x1 = (-(" + b + "+" + a + ")+" + "√(" + d + "))/" + 2 * a + " = (" + -(b + a) + "+√(" + d + "))/" + 2 * a);
            System.out.println("x1 = " + x1 + "\n");
            double x2 = (-(b + a) - discriminant) / 2 * a;
            System.out.println("x2 = (-(" + b + "+" + a + ")-" + "√(" + d + "))/" + 2 * a + " = (" + -(b + a) + "-√(" + d + "))/" + 2 * a);
            System.out.println("x2 = " + x2 + "\n");
            System.out.println("x3 = 1");
        }
    }
}
