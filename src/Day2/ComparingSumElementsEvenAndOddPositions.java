package Day2;

public class ComparingSumElementsEvenAndOddPositions {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 6, 9, 7, 4, 3, 6, 8, 9, 6, 8, 4, 3};

        int sumEvenElements = 0;
        int sumOddElements = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sumEvenElements += numbers[i];
            } else {
                sumOddElements += numbers[i];
            }
        }

        if (sumEvenElements > sumOddElements) {
            System.out.printf("Сумма элементов на четных позициях: %d, больше суммы нечетных.", sumEvenElements);
        } else if (sumEvenElements < sumOddElements) {
            System.out.printf("Сумма элементов на нечетных позициях: %d,  больше суммы четных.", sumOddElements);
        } else {
            System.out.println("Суммы четных и нечетных значений равны.");
        }
    }
}
