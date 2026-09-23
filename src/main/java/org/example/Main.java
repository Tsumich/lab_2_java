package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите задание для выполнения:");
            System.out.println("1 - Задание 1");
            System.out.println("2 - Задание 2");
            System.out.println("3 - Задание 3");
            System.out.println("4 - Задание 4");
            System.out.println("5 - Задание 5");
            System.out.print("Введите номер (1-5): ");


                int choice = scanner.nextInt();

                switch (choice) {
                    case 0:
                        return;
                    case 1:
                        Lab1.ex_1();
                        break;
                    case 2:
                        Lab1.ex_2();
                        break;
                    case 3:
                        Lab1.ex_3();
                        break;
                    case 4:
                        Lab1.ex_4();
                        break;
                    case 5:
                        Lab1.ex_5();
                        break;
                    default:
                        System.out.println("Выберете задание 1-5");
                        break;
                }

        }

    }
}