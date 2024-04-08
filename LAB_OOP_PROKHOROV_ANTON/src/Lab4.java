// ООП Лабораторна робота №4

public class Lab4{
    public static void lab4(){
        // Завдання №1
        task1();

        // Завдання №2
        task2();

        // Завдання №3
        task3();

        // Завдання №4
        task4();
    }

    // Метод для виконання завдання №1
    public static void task1() {
        System.out.println("Результат виконання програми до завдання №1: "); // виводимо текст на консоль
        // Створення пустого масиву на 50 елементів для зберігання парних чисел
        int[] evenNumbers = new int[50];
        // Створення пустого масиву на 50 елементів для зберігання непарних чисел
        int[] oddNumbers = new int[50];

        // Заповнення масиву парними числами від 0 до 98
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = i * 2;
        }

        // Заповнення масиву непарними числами від 1 до 99
        for (int i = 0; i < 50; i++) {
            oddNumbers[i] = i * 2 + 1;
        }

        // Виведення масиву парних чисел на екран
        System.out.println("Парні числа:");
        for (int i = 0; i < 50; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Виведення масиву непарних чисел на екран
        System.out.println("\nНепарні числа:");
        for (int i = 0; i < 50; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }

    // Метод для виконання завдання №2
    public static void task2() {
        // Заданий масив чисел
        System.out.println("Результат виконання програми до завдання №2: "); // виводимо текст на консоль
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        // Перебір масиву циклом while та виведення кожного елементу
        System.out.println("Перебір масиву циклом while:");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        // Перебір масиву циклом for та виведення кожного елементу
        System.out.println("Перебір масиву циклом for:");
        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Перебір масиву циклом while з виведенням елементів на непарних індексах
        System.out.println("Перебір масиву циклом while з виводом непарних індексів:");
        i = 1;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i += 2;
        }
        System.out.println();

        // Перебір масиву циклом for з виведенням елементів на парних індексах
        System.out.println("Перебір масиву циклом for з виводом парних індексів:");
        for (i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Виведення масиву в зворотньому порядку
        System.out.println("Масив в зворотньому порядку:");
        for (i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Метод для виконання завдання №3
    public static void task3() {
        System.out.println("Результат виконання програми до завдання №3: "); // виводимо текст на консоль

        System.out.print("Введіть кількість елементів у масиві: ");
        int n = Main.sc.nextInt(); // Зчитування кількості елементів у масиві

        double[] arr = new double[n]; // Ініціалізація масиву з заданою кількістю елементів

        // Заповнення масиву елементами, введеними користувачем
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            arr[i] = Main.sc.nextDouble(); // Зчитування елементів масиву з клавіатури
        }

        double sum = 0.0; // Змінна для збереження суми елементів масиву

        // Обчислення суми елементів масиву
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Додавання елементів масиву до суми
        }

        System.out.println("Сума елементів масиву: " + sum); // Виведення суми елементів масиву
    }

    // Метод для виконання завдання №4
    public static void task4() {
        System.out.println("Результат виконання програми до завдання №4: "); // виводимо текст на консоль
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // масив цілих чисел
        // Змінюємо знак непарних елементів масиву
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] *= -1;
            }
        }
        // Виводимо масив на екран
        System.out.print("Масив після зміни знаку непарних елементів: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}