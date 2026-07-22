package Day3;

import java.util.Scanner;

public class SimplePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        String invertedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            invertedWord += word.charAt(i);
        }

        if (word.equals(invertedWord)) {
            System.out.printf("Слово %s палиндром", word);
        } else {
            System.out.printf("Слово %s не палиндром", word);
        }

        scanner.close();
    }
}
