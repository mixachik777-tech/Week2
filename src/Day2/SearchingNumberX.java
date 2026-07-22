package Day2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SearchingNumberX {
    public static void main(String[] args) {
        System.out.print("Введите искомое числа в массиве: ");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {5,4,9,2,1,6,4,5,9,8,5,2,6,4,7,8,5,2,};
        int sellect  = scanner.nextInt();

        boolean numberDifference = false;

        for (int x:numbers) {
            if (x == sellect) {
                numberDifference = true;
                break;
            }
        }
        if (numberDifference == true) {
            System.out.println("Статус: число найдено");
        } else if (numberDifference == false) {
            System.out.println("Статус: число не найдено");
        }
    }
}
