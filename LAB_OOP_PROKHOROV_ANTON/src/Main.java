//Лабораторна робота №1-5
// Java_Code

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in); // Об'єкт Scanner для зчитування введених даних

    public static void main(String[] args) {

        int input = 0;
        while (true) {
            System.out.println("\n\n Виберіть лабораторну роботу (1-5)\n >>> ");
            input = sc.nextInt();
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
                default:
                    System.out.println("\n\n Кінець роботи програми!");
                    System.exit(0);
            }
        }
    }
}
