// ООП Лабораторна робота №2

public class Lab2 {
    public static void lab2(){
        System.out.println("Виберіть завдання (1, 2, 3, 4 або 5): ");
        int taskNumber = Main.sc.nextInt();

        switch (taskNumber) {
            case 1:
                solveTask1();
                break;
            case 2:
                solveTask2();
                break;
            case 3:
                solveTask3();
                break;
            case 4:
                solveTask4();
                break;
            case 5:
                solveTask5();
                break;
            default:
                System.out.println("Неправильний номер завдання.");
        }
    }

    // Метод для розв'язання першого завдання: квадратне рівняння
    public static void solveTask1() {
        System.out.println("Введіть коефіцієнти квадратного рівняння: ");
        double a, b, c;
        System.out.print("a=");
        a = Main.sc.nextInt();
        System.out.print("b=");
        b = Main.sc.nextInt();
        System.out.print("c=");
        c = Main.sc.nextInt();

        if (a == 0) {
            double x = -c / b;
            System.out.println("Розв'язок лінійного рівняння: " + x);
        } else {
            double D = Math.pow(b, 2) - 4 * a * c;

            double x0, x1, x2;

            if (D > 0) {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Розв'язки: " + x1 + " та " + x2);
            } else if (D == 0) {
                x0 = -b / (2 * a);
                System.out.println("Розв'язок: " + x0);
            } else {
                double x11 = (-b / (2 * a));
                double x00 = Math.sqrt(-D) / (2 * a);
                System.out.println("Розв'язки: " + "x1= " + x11 + " + i* " + x00 + " та x2= " + x11 + " - i* " + x00);
            }
        }
    }

    // Метод для розв'язання другого завдання: визначення квадранта за координатами точки
    public static void solveTask2() {
        System.out.print("x=");
        double x = Main.sc.nextInt();
        System.out.print("y=");
        double y = Main.sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в першому квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в другому квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в третьому квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в четвертому квадранті.");
        } else if (x == 0 && y > 0) {
            System.out.println("Точка знаходиться на додатній піввісі ординат.");
        } else if (x == 0 && y < 0) {
            System.out.println("Точка знаходиться на від'ємній піввісі ординат.");
        } else if (x > 0 && y == 0) {
            System.out.println("Точка знаходиться на додатній піввісі абцис.");
        } else if (x < 0 && y == 0) {
            System.out.println("Точка знаходиться на від'ємній піввісі абцис.");
        } else {
            System.out.println("Точка знаходиться у початку координатної площини.");
        }
    }

    // Метод для розв'язання третього завдання: перевірка, чи число є двозначним та парним
    public static void solveTask3() {
        System.out.println("Введіть число:");
        int number = Main.sc.nextInt();

        if (number >= 10 && number <= 99) {
            if (number % 2 == 0) {
                System.out.println("Число " + number + " є двозначним і парним.");
            } else {
                System.out.println("Число " + number + " є двозначним, але не парним.");
            }
        } else {
            System.out.println("Число не є двозначним.");
        }
    }

    // Метод для розв'язання четвертого завдання: обчислення значення функції
    public static void solveTask4() {
        System.out.println("Введіть число:");
        double x = Main.sc.nextInt();

        double f;

        if (x < 0) {
            f = (Math.exp(x) + Math.exp(-x)) / 2;
        } else if (x >= 0 && x <= 1) {
            f = Math.pow(Math.cos(x), 2) + 2 * Math.pow(Math.sin(x + 1), 1 / 3);
        } else {
            f = Math.sqrt(Math.abs(Math.cos(Math.pow((x - 1), 3))));
        }

        System.out.println(f);
    }

    // Метод для розв'язання п'ятого завдання: виконання різних операцій
    public static void solveTask5() {
        System.out.println("Меню:");
        System.out.println("1. Визначити, чи це робочий день");
        System.out.println("2. Визначити пору року за номером місяця");
        System.out.println("3. Вивести кількість днів у місяці");
        System.out.println("4. Вивести різноманітні повідомлення");
        System.out.println("5. Вивести назву предмету за номером пари");
        System.out.println("6. Визначити, в яку чверть години потрапляє число хвилин");
        System.out.println("7. Виконати арифметичні операції");

        System.out.println("Виберіть опцію (введіть число від 1 до 7):");
        int choice = Main.sc.nextInt();

        switch (choice) {
            case 1:
                checkWorkingDay();
                break;
            case 2:
                checkSeason();
                break;
            case 3:
                checkDaysInMonth();
                break;
            case 4:
                displayMessages();
                break;
            case 5:
                displaySubject();
                break;
            case 6:
                determineQuarter();
                break;
            case 7:
                performArithmeticOperations();
                break;
            default:
                System.out.println("Неправильний вибір.");
        }
    }

    // Метод для перевірки, чи це робочий день
    public static void checkWorkingDay() {
        System.out.println("Введіть номер дня тижня (від 1 до 7):");
        int dayNumber = Main.sc.nextInt();
        if (dayNumber >= 1 && dayNumber <= 7) {
            if (dayNumber >= 1 && dayNumber <= 5) {
                System.out.println("Це робочий день.");
            } else {
                System.out.println("Це вихідний.");
            }
        } else {
            System.out.println("Неправильний номер дня тижня.");
        }
    }

    // Метод для визначення пори року за номером місяця
    public static void checkSeason() {
        System.out.println("Введіть номер місяця (від 1 до 12):");
        int monthNumber = Main.sc.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;
            if (monthNumber >= 3 && monthNumber <= 5) {
                season = "весна";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "літо";
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                season = "осінь";
            } else {
                season = "зима";
            }
            System.out.println("Цей місяць належить до " + season + ".");
        } else {
            System.out.println("Неправильний номер місяця.");
        }
    }

    // Метод для виведення кількості днів у місяці
    public static void checkDaysInMonth() {
        System.out.println("Введіть номер місяця (від 1 до 12):");
        int monthNumber = Main.sc.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            int daysInMonth;
            if (monthNumber == 2) {
                daysInMonth = 28; // за умови, що ми не розглядаємо високосні роки
            } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }
            System.out.println("У цьому місяці " + daysInMonth + " днів.");
        } else {
            System.out.println("Неправильний номер місяця.");
        }
    }

    // Метод для виведення різноманітних повідомлень
    public static void displayMessages() {
        System.out.println("1. Привітання");
        System.out.println("2. Запрошення до роботи на комп’ютері");
        System.out.println("3. Пропозиція завершити роботу");
        System.out.println("Виберіть опцію (введіть число від 1 до 3):");
        int option = Main.sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Привіт!");
                break;
            case 2:
                System.out.println("Запрошуємо вас до роботи на комп'ютері.");
                break;
            case 3:
                System.out.println("Бажаєте завершити роботу?");
                break;
            default:
                System.out.println("Неправильний вибір.");
        }
    }

    // Метод для виведення назви предмету за номером пари
    public static void displaySubject() {
        System.out.println("Введіть номер пари (від 1 до 4):");
        int pairNumber = Main.sc.nextInt();
        String subject;
        switch (pairNumber) {
            case 1:
                subject = "Математика";
                break;
            case 2:
                subject = "Фізика";
                break;
            case 3:
                subject = "Хімія";
                break;
            case 4:
                subject = "Біологія";
                break;
            default:
                subject = "Не визначено";
        }
        System.out.println("На цій парі ви вивчаєте: " + subject);
    }

    // Метод для визначення, в яку чверть години потрапляє число хвилин
    public static void determineQuarter() {
        System.out.println("Введіть число від 0 до 59:");
        int minutes = Main.sc.nextInt();
        if (minutes >= 0 && minutes <= 59) {
            int quarter = minutes / 15 + 1;
            System.out.println("Це число потрапляє в " + quarter + " чверть години.");
        } else {
            System.out.println("Неправильне число хвилин.");
        }
    }

    // Метод для виконання арифметичних операцій
    public static void performArithmeticOperations() {
        System.out.println("Введіть перше число:");
        double num1 = Main.sc.nextInt();
        System.out.println("Введіть друге число:");
        double num2 = Main.sc.nextInt();
        System.out.println("Виберіть операцію:");
        System.out.println("1. Добуток");
        System.out.println("2. Сума");
        System.out.println("3. Різниця");
        int operation = Main.sc.nextInt();
        double result;
        switch (operation) {
            case 1:
                result = num1 * num2;
                System.out.println("Добуток: " + result);
                break;
            case 2:
                result = num1 + num2;
                System.out.println("Сума: " + result);
                break;
            case 3:
                result = num1 - num2;
                System.out.println("Різниця: " + result);
                break;
            default:
                System.out.println("Неправильний вибір операції.");
        }
    }
}