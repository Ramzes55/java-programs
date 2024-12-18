public class EvenNumbers {
    public static void main(String[] args) {
        // Заданный массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Вывод всех чётных чисел
        System.out.println("Чётные числа:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
