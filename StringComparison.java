import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода
        Scanner scanner = new Scanner(System.in);

        // Ввод двух строк
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine();

        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Закрытие сканера
        scanner.close();
    }
}