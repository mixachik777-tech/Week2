package Day7;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.println("Ваши инициалы: " + initials(name, middleName));

        scanner.close();
    }

    public static String initials(String name, String middleName) {
        char firstLetter = Character.toUpperCase(name.charAt(0));
        char secondLetter = Character.toUpperCase(middleName.charAt(0));
        return firstLetter + ". " + secondLetter + ".";
    }
}
