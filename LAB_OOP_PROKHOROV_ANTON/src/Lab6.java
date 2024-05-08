// ООП Лабораторна робота №6

import java.sql.SQLOutput;

public class Lab6 {
    public static void lab6() {
        System.out.println("\n Лабораторна №6:\n");

        Person p1 = new Person();
        Person p2 = new Person("Anton Prokhorov", 19);

        p1.move();
        p2.talk();

        Phone ph1 = new Phone("+1 234 567 8910", "Iphone", 110.1);
        Phone ph2 = new Phone("+38 096 315 7746", "Samsung", 120.2);
        Phone ph3 = new Phone("+227 987 654 3210", "Nokia", 130.3);


        ph1.info();
        ph2.info();
        ph3.info();

        ph1.receiveCall(p1.fullName);
        System.out.println("\n " + ph1.getNumber());

        ph2.receiveCall(p2.fullName);
        System.out.println("\n " + ph2.getNumber());

        ph3.receiveCall(p1.fullName);
        System.out.println("\n " + ph3.getNumber());

        ph1.receiveCall(p2.fullName, ph2.getNumber());

        ph1.sendMessage(
                "Моє повідомлення",
                "+227 987 654 3210",
                "+38 096 315 7746"
                );

        Sedan s1 = new Sedan();
        Truck t1 = new Truck();

        s1.gas();
        t1.gas();

        s1.brake();
        t1.brake();

        Date d1 = new Date(1,2,2001);
        d1.printEU();
        d1.printUSA();
    }
}

class Person {
    String fullName;
    int age;

    Person() {}
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println("\n " + fullName + " крокує");
    }

    void talk() {
        System.out.println("\n " + fullName + " балакає");
    }
}

class Phone {
    String number;
    String model;
    double weight;

    Phone() {}

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void info() {
        System.out.println(
                "\n\n Модель: " + model +
                "\n Номер: " + number +
                "\n Вага: " + weight + " грам(и)"
        );
    }

    void receiveCall(String fullName) {
        System.out.println("\n Дзвонить " + fullName);
    }

    void receiveCall(String fullName, String number) {
        System.out.println(
                "\n Дзвонить: " + fullName +
                        "\n Номер: " + number
                );
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String message, String... phoneNumbers) {
        System.out.println("\n Повідомлення: < " + message + " >");
        System.out.println(" Номери телефонів яким буде надіслано повідомлення:");

        for (String number:phoneNumbers) {
            System.out.println(" " + number);
        }
    }

}

class Shape {
    double volume;
    public double getVolume() {
        return  volume;
    }
}

class Pyramid extends  Shape{
    double s, h;
}

class SOR extends Shape{
    double radius;
    public double getRadius() {
        return  radius;
    }
}

class Cylinder extends SOR {
    double height;
}

class Ball extends SOR {

}

abstract class CarLR6 {
    String model, color;
    int maxSpeed;

    void gas() {
        System.out.println("\n Газуємо!");
    }

    abstract void brake();
}

class Sedan extends CarLR6 {
    @Override
    void brake() {
        System.out.println("\n Седан гальмує...");
    }
}

class Truck extends CarLR6 {
    @Override
    void brake() {
        System.out.println("\n Вантажівка гальмує...");
    }
}

/*
5.9.	Створити клас для роботи з датою.
Дані класу: день, місяць, рік.
Відкриті функції класу: введення дати,
виведення дати в європейському стандарті (ДД: ММ: РР),
виведення дати в американському стандарті (ММ: ДД: РР).

6.	На основі класу заданого у завданні 5 згідно варіанту створити клас - спадкоємець,
який розширює можливості класу батька.
До новоствореного класу додати два поля( які саме? – придумайте самостійно),
а також перевизначити функцію виведення даних класу на екран.
*/

class Date {
    int dd,mm,yyyy;

    Date() {}

    Date(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    void printEU() {
        System.out.printf("\n\n В європейському стандарті (ДД:ММ:РРРР):");
        System.out.printf("\n %02d:%02d:%04d", dd, mm, yyyy);
    }

    void printUSA() {
        System.out.printf("\n\n В американському стандарті (ММ:ДД:РРРР):");
        System.out.printf("\n %02d:%02d:%04d", mm, dd, yyyy);
    }

    void setDate() {
        System.out.println("\n Введіть день: ");

        while (true) {
            dd = Main.scanInt();
            if(dd < 1 || dd > 31) {
                System.out.println("\n Некоректний день! Спробуйте знову.\n >>> ");
            }
            else break;
        }

        System.out.println("\n Введіть місяць: ");

        while (true) {
            mm = Main.scanInt();
            if(mm < 1 || mm > 12) {
                System.out.println("\n Некоректний місяць! Спробуйте знову.\n >>> ");
            }
            else break;
        }

        System.out.println("\n Введіть рік: ");

        while (true) {
            yyyy = Main.scanInt();
            if(yyyy < 0 || yyyy > 9999) {
                System.out.println("\n Некоректний рік! Спробуйте знову.\n >>> ");
            }
            else break;
        }
    }
}

class DateTime extends Date {
    // додаткове поле_1 time
    // додаткове поле_2

    DateTime() {
        super();
        //time...
        // this second = second ...
    }
    @Override
    void printEU()
    {
        super.printEU();
        // print time
    }

    @Override
    void printUSA()
    {
        super.printUSA();
        // print time
    }
}