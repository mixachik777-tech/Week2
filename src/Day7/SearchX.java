package Day7;

import java.util.Scanner;

public class SearchX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {5, 4, 9, 2, 1, 6, 4, 5, 9, 8, 5, 2, 6, 4, 7, 8, 5, 2};

        System.out.print("Введите искомое число: ");
        int target = scanner.nextInt();

        if (contains(numbers, target)) {
            System.out.println("Число найдено");
        } else {
            System.out.println("Число не найдено");
        }

        scanner.close();
    }

    public static boolean contains(int[] numbers, int target) {
        for (int number : numbers) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }
}
