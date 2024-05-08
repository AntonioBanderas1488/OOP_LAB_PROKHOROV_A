import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Клас для створення вікна програми для обчислення потужності струму в провіднику з опором R
public class HeatCalculationApp extends JFrame {
    // Об'єкти для введення маси, температури, кнопки обчислення та відображення результату
    private JTextField massTextField;
    private JTextField temperatureTextField;
    private JButton calculateButton;
    private JLabel resultLabel;

    // Конструктор класу
    public HeatCalculationApp() {
        // Встановлення заголовку вікна та операції закриття вікна при закритті
        setTitle("Розрахунок потужності сили струму в провіднику з опором R");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Створення панелі для розміщення компонентів вводу
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());

        // Додавання текстового поля для введення сили струму
        JLabel massLabel = new JLabel("Сила струму I[A]:");
        massTextField = new JTextField(10);
        contentPanel.add(massLabel);
        contentPanel.add(massTextField);

        // Додавання текстового поля для введення опору
        JLabel temperatureLabel = new JLabel("Опір R[Ом]:");
        temperatureTextField = new JTextField(10);
        contentPanel.add(temperatureLabel);
        contentPanel.add(temperatureTextField);

        // Додавання кнопки для обчислення
        calculateButton = new JButton("Розрахувати");
        contentPanel.add(calculateButton);

        add(contentPanel, BorderLayout.CENTER);

        // Створення панелі для центрування мітки результату
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        // Встановлення відступів для панелі
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Додавання мітки для виведення результату до панелі центрування
        resultLabel = new JLabel("Потужність P[Вт]: ");
        centerPanel.add(resultLabel);

        add(centerPanel, BorderLayout.SOUTH);

        // Додавання слухача подій для кнопки обчислення
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateHeat();
            }
        });

        pack();
        setVisible(true);
    }

    // Метод для обчислення потужності тепла
    private void calculateHeat() {
        try {
            // Отримання введених даних
            double I = Double.parseDouble(massTextField.getText());
            double R = Double.parseDouble(temperatureTextField.getText());

            // Обчислення потужності тепла
            double P = I * I * R;

            // Виведення результату
            resultLabel.setText("Потужність P: " + P + " Вт");
        } catch (NumberFormatException e) {
            // Обробка помилки у введених даних
            resultLabel.setText("Помилка: Невірний формат введених даних");
        }
    }

    // Метод main для запуску програми
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HeatCalculationApp();
            }
        });
    }
}
