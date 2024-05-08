import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab7 {
    // Головний метод класу Lab7, який містить код для виконання лабораторної роботи
    public static void lab7() {
        System.out.println("\n Лабораторна №7:\n");
        // Створення об'єкту HashMap для зберігання прізвищ та номерів телефонів
        Map<String, String> phoneBook = new HashMap<>();

        // Додавання елементів до книги
        phoneBook.put("Петров", "123456789");
        phoneBook.put("Іванов", "987654321");
        phoneBook.put("Сидоров", "555555555");
        phoneBook.put("Ковальчук", "111111111");
        phoneBook.put("Семенов", "999999999");
        phoneBook.put("Мельник", "777777777");
        phoneBook.put("Коваленко", "222222222");
        phoneBook.put("Бондаренко", "888888888");
        phoneBook.put("Шевченко", "444444444");
        phoneBook.put("Богданов", "666666666");

        // Виведення всіх записів з книги
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String lastName = entry.getKey();
            String phoneNumber = entry.getValue();
            System.out.println(lastName + ": " + phoneNumber);
        }

        // Введення прізвища для пошуку номеру телефону
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть прізвище для пошуку номеру телефону: ");
        String searchLastName = scanner.nextLine();

        // Пошук номера телефону за прізвищем
        if (phoneBook.containsKey(searchLastName)) {
            String phoneNumber = phoneBook.get(searchLastName);
            System.out.println("Номер телефону для прізвища " + searchLastName + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення довільного запису з книги

        String removeLastName = "Коваленко";
        phoneBook.remove(removeLastName);
        System.out.println("Запис для прізвища " + removeLastName + " був видалений");

        // Виведення кількості записів у книзі
        int size = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + size);
    }
}