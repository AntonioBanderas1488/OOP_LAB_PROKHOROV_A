// ООП Лабораторна робота №5

public class Lab5 {
    public static void lab5() {
        System.out.println("\n Лабораторна №5:\n");

        while (true) {
            // Виводимо меню
            System.out.println("Оберіть опцію:");
            System.out.println("1. Площа геометричних фігур");
            System.out.println("2. Знаходження найменшого числа");
            System.out.println("3. Виведення масиву");
            System.out.println("4. Знаходження найбільшого числа в масиві");
            System.out.println("5. Вихід");

            System.out.print("Ваш вибір: ");
            int choice = Main.scanInt();

            switch (choice) {
                case 1:
                    calculateGeometryArea(); // Викликаємо метод для обчислення площі геометричних фігур
                    break;
                case 2:
                    findMinimum(); // Викликаємо метод для знаходження найменшого числа
                    break;
                case 3:
                    printArray(); // Викликаємо метод для виведення масиву
                    break;
                case 4:
                    findMaximum(); // Викликаємо метод для знаходження найбільшого числа в масиві
                    break;
                case 5:
                    System.out.println("До побачення!");
                    return;
                default:
                    System.out.println("Неправильний вибір. Будь ласка, виберіть опцію зі списку.");
            }
        }
    }

    public static void calculateGeometryArea() {

        // Виводимо меню обчислення площі геометричних фігур
        System.out.println("Оберіть опцію:");
        System.out.println("1. Площа квадрата");
        System.out.println("2. Площа прямокутника");
        System.out.println("3. Площа паралелограма");
        System.out.println("4. Площа ромба");
        System.out.println("5. Площа прямокутного трикутника");
        System.out.println("6. Площа трапеції");
        System.out.println("7. Площа кола");

        System.out.print("Ваш вибір: ");
        int choice = Main.scanInt();

        double result = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Введіть довжину сторони квадрата: ");
                double side = Main.scanDouble();
                result = squareArea(side); // Викликаємо метод для обчислення площі квадрата
                break;
            case 2:
                System.out.print("Введіть довжину та ширину прямокутника: ");
                double length = Main.scanDouble();
                double width = Main.scanDouble();
                result = rectangleArea(length, width); // Викликаємо метод для обчислення площі прямокутника
                break;
            case 3:
                System.out.print("Введіть довжину основи та висоту паралелограма: ");
                double baseParallelogram = Main.scanDouble();
                double heightParallelogram = Main.scanDouble();
                result = parallelogramArea(baseParallelogram, heightParallelogram); // Викликаємо метод для обчислення площі паралелограма
                break;
            case 4:
                System.out.print("Введіть довжину однієї сторони та висоту ромба: ");
                double sideRhombus = Main.scanDouble();
                double heightRhombus = Main.scanDouble();
                result = rhombusArea(sideRhombus, heightRhombus); // Викликаємо метод для обчислення площі ромба
                break;
            case 5:
                System.out.print("Введіть довжину катетів прямокутного трикутника: ");
                double leg1 = Main.scanDouble();
                double leg2 = Main.scanDouble();
                result = triangleArea(leg1, leg2); // Викликаємо метод для обчислення площі прямокутного трикутника
                break;
            case 6:
                System.out.print("Введіть довжини основ та висоту трапеції: ");
                double base1 = Main.scanDouble();
                double base2 = Main.scanDouble();
                double heightTrapezoid = Main.scanDouble();
                result = trapezoidArea(base1, base2, heightTrapezoid); // Викликаємо метод для обчислення площі трапеції
                break;
            case 7:
                System.out.print("Введіть радіус кола: ");
                double radius = Main.scanDouble();
                result = circleArea(radius); // Викликаємо метод для обчислення площі кола
                break;
            default:
                System.out.println("Неправильний вибір. Будь ласка, виберіть опцію зі списку.");
                return;
        }

        System.out.println("Площа: " + result);
        System.out.println();
    }

    // Метод для обчислення площі квадрата
    public static double squareArea(double side) {
        return side * side;
    }

    // Метод для обчислення площі прямокутника
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Метод для обчислення площі паралелограма
    public static double parallelogramArea(double base, double height) {
        return base * height;
    }

    // Метод для обчислення площі ромба
    public static double rhombusArea(double side, double height) {
        return side * height;
    }

    // Метод для обчислення площі прямокутного трикутника
    public static double triangleArea(double leg1, double leg2) {
        return 0.5 * leg1 * leg2;
    }

    // Метод для обчислення площі трапеції
    public static double trapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }

    // Метод для обчислення площі кола
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Метод для знаходження найменшого числа
    public static void findMinimum() {
        System.out.print("Введіть три числа через пробіл: ");
        double num1 = Main.scanDouble();
        double num2 = Main.scanDouble();
        double num3 = Main.scanDouble();

        double min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Найменше число: " + min);
    }

    // Метод для виведення масиву
    public static void printArray() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для знаходження найбільшого числа в масиві
    public static void findMaximum() {
        int[] array = {5, 3, 9, 1, 7};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Найбільше число в масиві: " + max);
    }
}