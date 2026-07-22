package Day5;

import java.util.Scanner;

public class MixedTasks {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 3, 2, 4, 3};
        char[] symbols = {'a', 'b', '5', 'c', '1', '2', 'd', '9', 'e', '3', 'f', '4', '7', 'g', '8'};
        String[] word = {"яблоко", "банан", "виноград", "апельсин", "клубника", "киви", "лимон", "персик", "слива", "манго"};

        Task task = new Task();
        task.ratingStatistics(numbers);
        task.arraySorted(numbers);
        task.numberLetterCounter(symbols);
        task.longWord(word);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String secondWord = scanner.nextLine();
        task.caseFreeComparison(firstWord, secondWord);

    }
}

class Task {
    public void ratingStatistics(int[] arr) {
        int bad = 0;
        int average = 0;
        int excellent = 0;
        int sum = 0;

        for (int x : arr) {
            if (x == 2) {
                bad++;
            } else if (x == 3) {
                average++;
            } else {
                excellent++;
            }
        }

        for (int x : arr) {
            sum += x;
        }
        double arithmeticMean = (double) sum / arr.length;

        System.out.printf("Ваши оценки: плохих - %d шт, хороших - %d шт, отличных - %d шт. Средний бал - %.2f.\n", bad, average, excellent, arithmeticMean);
    }

    public void arraySorted(int[] arr) {
        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Массив упорядочен");
        } else {
            System.out.println("Массив НЕ упорядочен");
        }
    }

    public void numberLetterCounter(char[] arr) {
        int numbers = 0;
        int letters = 0;

        for (char x : arr) {
            if (Character.isDigit(x)) {
                numbers++;
            } else {
                letters++;
            }
        }

        System.out.printf("Количество цифр: %d\nКоличество букв: %d\n", numbers, letters);
    }

    public void longWord(String[] arr) {
        String longestWord = arr[0];
        int maxLength = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                longestWord = arr[i];
                maxLength = arr[i].length();

            }
        }
        System.out.printf("Самое длинное слово: %s\nКоличество его символов: %d\n", longestWord, maxLength);
    }

    public void caseFreeComparison(String firstWord, String secondWord) {
        if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("Слова равны без учёта регистра");
        } else {
            System.out.println("Слова разные");
        }
    }
}