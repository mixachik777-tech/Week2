package Day1;

public class CreateAnArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};

        for (int x:numbers) {
            System.out.println(x);
        }

        System.out.println();

        int sum = 0;
        for (int x:numbers) {
            sum = sum + x;
        }
        System.out.println("Сумма объектов массива равна: " + sum);

        double average = (double) sum / numbers.length;

        System.out.println();

        System.out.println("Среднее арифметическое: " + average);
    }
}
