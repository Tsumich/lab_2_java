package org.example;

import java.util.Scanner;

public class Lab1 {
    public static void ex_1(){
        for (int i = 1; i <= 500; i++) {
            if(i % 5 == 0 || i % 7 == 0){
                System.out.print(i + " - ");
            }
            if(i % 5 == 0 && i % 7 == 0){
                System.out.println("fizzbuzz");
                continue;
            }
            if(i % 5 == 0){
                System.out.println("fizz");
                continue;
            }if(i % 7 == 0){
                System.out.println("buzz");
            }
        }
    }

    public static void ex_2(){
        String s = "make install";
        for (int i = s.length(); i > 0; i--) {
            char a = s.charAt(i - 1);
            System.out.print(a);
        }
        System.out.println();
    }

    public static void ex_3(){
        double a, b, c;
        double D;
        System.out.println("Введите a, b и c:");
        Scanner in = new Scanner(System.in);

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Нет вещественных корней!");
        }
    }

    public static void ex_4(){
        double suma = 0;
        double primer ;
        double epsilon = 1e-6;
        int n = 2;
        while (true) {
            primer = 1.0 / (n * n + n - 2);

            if (Math.abs(primer) < epsilon) {
                break;
            }

            suma += primer;
            n++;
        }
        System.out.println("Сумма ряда: " + suma);
    }

    public static void ex_5(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String word = scanner.nextLine().toLowerCase();

        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                System.out.println("Строка не полидром");
                return;
            }
        }
        System.out.println("Строка  полидром");
    }

}
