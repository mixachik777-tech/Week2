package Day3;

import java.util.Scanner;

public class StartsWithLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String word = scanner.nextLine();

        if (word.length() == 0) {
            System.out.println("Строка пустая, первого символа нет.");
        } else if (Character.isLetter(word.charAt(0))) {
            System.out.println("Строка начинается с буквы.");
        } else {
            System.out.println("Строка начинается не с буквы.");
        }

        scanner.close();
    }
}
