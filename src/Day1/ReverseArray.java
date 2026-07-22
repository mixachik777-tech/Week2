package Day1;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 1, 7, 12, 5};

        System.out.println("Массив в обратном порядке:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}