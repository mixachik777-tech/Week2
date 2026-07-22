package Day2;

public class NumberPositive {
    public static void main(String[] args) {
        int[] numbers = {9, -5, 2, -6, 9, 7, 4, 3, -6, 8, 9, -6};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int x : numbers) {
            if (x > 0) {
                positive++;
            } else if (x < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Количество положительных: " + positive);
        System.out.println("Количество отрицательных: " + negative);
        System.out.println("Количество нулей: " + zero);
    }
}
