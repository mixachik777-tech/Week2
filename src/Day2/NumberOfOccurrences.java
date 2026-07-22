package Day2;

import java.util.Scanner;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        System.out.print("Введите искомое число: ");
        Scanner scanner = new Scanner(System.in);



        int[] numbers = {6,3,6,9,7,5,4,8,9,7,5,4,6,7,9,7,4,3,9};

        int quantity = scanner.nextInt();
        int claimNumber = 0;

        for(int x:numbers) {
            if (x == quantity) {
                claimNumber++;
            }
        }
        System.out.printf("Количество вхождений в массиве равно: %d%n", claimNumber);
    }
}
