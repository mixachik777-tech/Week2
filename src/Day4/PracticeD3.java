package Day4;

import java.util.Scanner;

public class PracticeD3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // ← один Scanner!
        int[] numbers = {6, 2, 1, 7, 12, 5};

        printArray(numbers);
        System.out.println("Сумма всех чисел в массиве: " + sumArray(numbers));
        System.out.println("Максимальное значение в массиве: " + maxArray(numbers));

        System.out.print("Введите искомое число: ");
        if (containsNumber(numbers, scanner.nextInt())) {
            System.out.println("Число найдено");
        } else {
            System.out.println("Число не найдено");
        }

        scanner.nextLine();   // ← съедаем лишний \n после nextInt()

        System.out.print("Впишите слово для проверки на палиндром: ");
        if (isPalindrome(scanner.nextLine())) {
            System.out.println("Ваше слово палиндром");
        } else {
            System.out.println("Ваше слово не палиндром");
        }

        System.out.print("Впишите предложение для подсчёта слов: ");
        String sentence = scanner.nextLine();
        System.out.println("Количество слов в предложении: " + countWords(sentence));

        scanner.close();   // ← закрываем один раз
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");   // ← print, не println!
        }
        System.out.println();   // ← перенос после всех элементов
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean containsNumber(int[] arr, int desiredNumber) {
        for (int x : arr) {
            if (x == desiredNumber) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    public static int countWords(String sentence) {
        String trimmed = sentence.trim();
        if (trimmed.length() == 0) {
            return 0;
        }
        int words = 0;
        boolean insideWord = false;
        for (int i = 0; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) == ' ') {
                insideWord = false;
            } else if (!insideWord) {
                words++;
                insideWord = true;
            }
        }
        return words;
    }
}
