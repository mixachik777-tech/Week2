package Day1;

public class MinMaxArray {
    public static void main(String[] args) {

        int[] numbers = {9,5,2,6,9,7,4,3,6,8,9,6};

        int min = numbers[0];
        int max = numbers[0];

        for (int x:numbers) {
            if (x < min) {
                min = x;
            }
        }

        for (int x:numbers) {
            if(x > max) {
                max = x;
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
    }
}
