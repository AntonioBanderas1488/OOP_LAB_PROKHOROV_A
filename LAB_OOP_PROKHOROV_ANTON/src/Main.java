//Лабораторна робота №1-7
// Java_Code
    /*5.9.	Створити клас для роботи з датою.
    Дані класу: день, місяць, рік. Відкриті функції
    класу: введення дати, виведення дати в
    європейському стандарті (ДД: ММ: РР),
    виведення дати в американському стандарті (ММ: ДД: РР).*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in); // Об'єкт Scanner для зчитування введених даних

    //public static boolean isValidInput = false;
    public static void main(String[] args) {

        /*int []arr = {3,1,2};

        for(int num:arr) {
            System.out.println(num);
        }

        System.out.println("\n\n");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        int input;
        while (true) {
            System.out.print("\n\n Виберіть лабораторну роботу (1-9)");
            input = scanInt();

            switch (input) {
                case 1:
                    Lab1.lab1();
                    break;
                case 2:
                    Lab2.lab2();
                    break;
                case 3:
                    Lab3.lab3();
                    break;
                case 4:
                    Lab4.lab4();
                    break;
                case 5:
                    Lab5.lab5();
                    break;
                case 6:
                    Lab6.lab6();
                    break;
                case 7:
                    Lab7.lab7();
                    break;
                case 8:
                    Lab8.lab8();
                    break;
                case 9:
                    HeatCalculationApp heatCalculationApp = new HeatCalculationApp();
                    break;
                default:
                    System.out.println("\n\n Кінець роботи програми!");
                    System.exit(0);
            }
        }
    }

    public static int scanInt() {
        int input;
        System.out.print("\n >>> ");
        while(true) {
            try {
                input = sc.nextInt();
                return input; // якщо scanner input - коректний
            }
            catch (java.util.InputMismatchException e) {
                System.out.print(" Некоректний тип даних! (Очікуваний тип: Int) Спробуйте знову... \n >>> ");
                sc.next(); // Очистка буфера
            }
        }
    }
    public static double scanDouble() {
        double input;
        System.out.print("\n >>> ");
        while(true) {
            try {
                input = sc.nextDouble();
                return input; // якщо scanner input - коректний
            } catch (java.util.InputMismatchException e) {
                System.out.print(" Некоректний тип даних! (Очікуваний тип: Double) Спробуйте знову... \n >>> ");
                sc.next(); // Очистка буфера
            }
        }
    }
}
