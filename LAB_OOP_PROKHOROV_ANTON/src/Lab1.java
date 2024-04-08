// ООП Лабораторна робота №1

public class Lab1{
    public static void lab1(){
        // Викликаємо функції завдань 1-4
        System.out.println("\nРезультат виконання завдання №1: ");
        task1();

        System.out.println("\nРезультат виконання завдання №2: ");
        task2();

        System.out.println("\nРезультат виконання завдання №3: ");
        task3();

        System.out.println("\nРезультат виконання завдання №4: ");
        task4();

        // Виконуємо завдання №5
        System.out.println("\nРезультат виконання завдання №5: ");
        task5();
    }

    // Завдання №1
    public static void task1() {
        int[] arr = new int[10]; // створюємо масив на 10 елементів для зберігання чисел

        // зчитуємо числа з клавіатури і заповнюємо масив
        for (int i = 0; i < 10; i++) {
            arr[i] = Main.sc.nextInt();
        }

        System.out.println("Числа: "); // виводимо текст на консоль

        // виводимо всі елементи масиву на консоль
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        double sum, sub, mul, div; // оголошуємо змінні для обчислення суми, різниці, добутку і частки
        sum = sub = mul = div = arr[0]; // ініціалізуємо всі значення з першого елемента масиву

        // обчислюємо суму, різницю, добуток і частку всіх чисел у масиві
        for (int i = 1; i < 10; i++) {
            sum += arr[i]; // додаємо елемент масиву до суми
            sub -= arr[i]; // віднімаємо елемент масиву з різниці
            mul *= arr[i]; // множимо елемент масиву на добуток
            div /= arr[i]; // ділимо елемент масиву на частку
        }

        // виводимо результати обчислень
        System.out.println(
                "\n Сума = " + sum + // виводимо результат суми
                        "\n Різниця = " + sub + // виводимо результат різниці
                        "\n Добуток = " + mul + // виводимо результат добутку
                        "\n Частка = " + div // виводимо результат частки
        );
    }

    // Завдання №2
    public static void task2() {
        // Варіант реалізації №1
        System.out.println("Варіант реалізації №1: ");

        // Ініціалізуємо рядок за допомогою окремих слів
        String w1 = "Go", w2 = "down", w3 = "my",
                w4 = "road", w5 = "running", w6 = "just",
                w7 = "as", w8 = "fast", w9 = "as",
                w10 = "I", w11 = "can", w12 = "!";

        // Складаємо речення з окремих слів
        String sentence = w1 + " " + w2 + " " + w3 + " " +
                w4 + " " + w5 + " " + w6 + " " +
                w7 + " " + w8 + " " + w9 + " " +
                w10 + " " + w11 + " " + w12;
        System.out.println(sentence); // Виводимо речення на консоль

        // Варіант реалізації №2
        System.out.println("Варіант реалізації №2: ");
        String[] mas = new String[10]; // Створюємо масив рядків розміром 10

        // Зчитуємо рядки з клавіатури і заповнюємо масив
        for (int i = 0; i < 10; i++) {
            mas[i] = Main.sc.next();
        }

        System.out.print("Речення: "); // Виводимо текст на консоль

        // Виводимо всі елементи масиву на консоль як речення
        for (int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    // Завдання №3
    public static void task3() {
        int aou = 10; // кількість користувачів
        User[] users = new User[aou]; // Створюємо масив користувачів розміром aou (кількість користувачів)
        int sum_age = 0; // Змінна для суми віку користувачів
        double sum_weight = 0; // Змінна для суми ваги користувачів
        double sum_height = 0; // Змінна для суми зросту користувачів

        // Заповнюємо масив користувачів та обчислюємо суми віку, ваги та зросту
        for (int i = 0; i < aou; i++) {
            System.out.println("Користувач №" + (i + 1)); // Виводимо номер поточного користувача
            users[i] = new User(); // Створюємо новий об'єкт користувача
            sum_age += users[i].age; // Додаємо вік поточного користувача до загальної суми віку
            sum_weight += users[i].weight; // Додаємо вагу поточного користувача до загальної суми ваги
            sum_height += users[i].height; // Додаємо зріст поточного користувача до загальної суми зросту
        }

        // Виводимо загальну суму віку, ваги та зросту користувачів на консоль
        System.out.println("Сумарний вік: " + sum_age);
        System.out.println("Сумарна вага: " + sum_weight);
        System.out.println("Сумарний зріст: " + sum_height);
    }

    // Завдання №4
    public static void task4() {
        int cars = 10; // Кількість автомобілів
        Car[] users = new Car[cars]; // Створюємо масив автомобілів розміром cars (кількість автомобілів)
        int sum_power = 0; // Змінна для суми потужностей автомобілів
        double sum_volume = 0; // Змінна для суми об'ємів автомобілів

        // Заповнюємо масив автомобілів та обчислюємо суми потужностей та об'ємів
        for (int i = 0; i < cars; i++) {
            System.out.println("Автомобіль №" + (i + 1)); // Виводимо номер поточного автомобіля
            users[i] = new Car(); // Створюємо новий об'єкт автомобіля
            sum_power += users[i].power; // Додаємо потужність поточного автомобіля до загальної суми потужностей
            sum_volume += users[i].volume; // Додаємо об'єм поточного автомобіля до загальної суми об'ємів
        }

        // Виводимо загальну суму потужностей та об'ємів автомобілів на консоль
        System.out.println("Сумарна потужність: " + sum_power);
        System.out.println("Сумарний об'єм: " + sum_volume);
    }

    // Завдання №5
    public static void task5() {
        System.out.println("Введіть число для реверсування: ");
        int inputNumber = Main.sc.nextInt();

        NumberReverser reverser = new NumberReverser(inputNumber);
        int reversed = reverser.reverseNumber();

        System.out.println("Реверснуте число: " + reversed);
    }
}

// Клас, що представляє користувача
class User {
    int id, age; // Поля для id та віку користувача
    String name, surname; // Поля для імені та прізвища користувача
    double weight, height; // Поля для ваги та зросту користувача

    // Конструктор для ініціалізації об'єкта користувача
    public User() {
        System.out.println("\n Введіть Id: ");
        this.id = Main.sc.nextInt(); // Зчитуємо id користувача з консолі

        System.out.println("\n Введіть Age: ");
        this.age = Main.sc.nextInt(); // Зчитуємо вік користувача з консолі

        System.out.println("\n Введіть Name: ");
        this.name = Main.sc.next(); // Зчитуємо ім'я користувача з консолі

        System.out.println("\n Введіть Surname: ");
        this.surname = Main.sc.next(); // Зчитуємо прізвище користувача з консолі

        System.out.println("\n Введіть Weight: ");
        this.weight = Main.sc.nextDouble(); // Зчитуємо вагу користувача з консолі

        System.out.println("\n Введіть Height: ");
        this.height = Main.sc.nextDouble(); // Зчитуємо зріст користувача з консолі
    }
}

// Клас, що представляє автомобілі
class Car {
    int id, power, volume; // Поля для id, потужності та об'єму автомобіля
    String mark, model; // Поля для марки та моделі автомобіля
    double weight, height; // Поля для ваги та висоти автомобіля

    // Конструктор для ініціалізації об'єкта користувача
    public Car() {
        System.out.println("\n Введіть Id: ");
        this.id = Main.sc.nextInt(); // Зчитуємо id автомобіля з консолі

        System.out.println("\n Введіть Mark: ");
        this.mark = Main.sc.next(); // Зчитуємо марку автомобіля з консолі

        System.out.println("\n Введіть Model: ");
        this.model = Main.sc.next(); // Зчитуємо модель автомобіля з консолі

        System.out.println("\n Введіть Power: ");
        this.power = Main.sc.nextInt(); // Зчитуємо потужність автомобіля з консолі

        System.out.println("\n Введіть Volume: ");
        this.volume = Main.sc.nextInt(); // Зчитуємо об'єм автомобіля з консолі

        System.out.println("\n Введіть Weight: ");
        this.weight = Main.sc.nextDouble(); // Зчитуємо вагу автомобіля з консолі

        System.out.println("\n Введіть Height: ");
        this.height = Main.sc.nextDouble(); // Зчитуємо висоту автомобіля з консолі
    }
}

// Клас для реверсування числа
class NumberReverser {
    private int number;

    public NumberReverser(int number) {
        this.number = number;
    }

    public int reverseNumber() {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}