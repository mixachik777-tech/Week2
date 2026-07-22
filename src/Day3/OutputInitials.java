package Day3;

import java.util.Scanner;

public class OutputInitials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите Отчество: ");
        String middleName = scanner.nextLine();

        System.out.println("Ваши инициалы: " + Character.toUpperCase(name.charAt(0)) + ". " + Character.toUpperCase(middleName.charAt(0)) + ".");
    }
}