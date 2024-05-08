import java.io.*;
import java.util.*;
import java.io.FileWriter; //: Цей клас використовується для читання символів з файлу.
import java.util.Scanner; //: Цей клас дозволяє зчитувати введені дані з консолі.
import java.io.IOException;

class Lab8 {
    public static void lab8() {
        try {
            FileWriter1.main(); // Виклик методу main() класу FileWriter1
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FileWriter1 {
    public static void main() throws IOException {
        Scanner s = new Scanner(System.in); // Створення об'єкту Scanner для отримання введених даних
        System.out.print("Введіть шлях до файлу наприклад:\nC:\\\\Users\\\\Kardano\\\\Desktop\\\\myFile.txt\n");
        String f = s.nextLine(); // Отримання шляху до файлу від користувача

        int a;
        File file = new File(f); // Створення об'єкту File з введеного шляху
        if (file.exists()) { // Перевірка наявності файлу
            System.out.print("Введіть межі [x, y]. \nx = ");
            int x = s.nextInt(); // Отримання значення x від користувача
            System.out.print("y = ");
            int y = s.nextInt(); // Отримання значення y від користувача
            FileWriter writer = new FileWriter(f, false); // Створення об'єкту FileWriter для запису в файл
            for (int i = 0; i < 10; i++) { // Записуємо 10 випадкових чисел у файл
                a = new Random().nextInt(y - x + 1) + x; // Генеруємо випадкове число в межах [x, y]
                String text = String.valueOf(a);
                writer.write(text + '\n'); // Записуємо число у файл
            }
            writer.close(); // Закриваємо FileWriter
        } else {
            try {
                boolean created = file.createNewFile(); // Створення нового файлу, якщо він не існує
                if (created) {
                    System.out.print("Введіть межі [x, y]. \n x = ");
                    int x = s.nextInt();
                    System.out.print("y = ");
                    int y = s.nextInt();
                    FileWriter writer = new FileWriter(f, false);
                    for (int i = 0; i < 10; i++) {
                        a = new Random().nextInt(y - x + 1) + x;
                        String text = String.valueOf(a);
                        writer.write(text + '\n');
                    }
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Помилка");
            }
        }
    }
}
