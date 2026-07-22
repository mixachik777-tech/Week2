package Day7;

public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {9, 5, 2, 6, 9, 7, 4, 3, 6, 8, 9, 6};
        System.out.println("Максимальное значение массива: " + max(numbers));
    }

    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
