import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Установка кодировки UTF-8
        System.setProperty("file.encoding", "UTF-8");

        Scanner scanner = new Scanner(System.in);

        // Ввод чисел a и b
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение операций
        System.out.println("Результаты операций:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        
        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("a / b = " + ((double) a / b));
        } else {
            System.out.println("a / b = Деление на ноль невозможно");
        }

        scanner.close();
    }
}