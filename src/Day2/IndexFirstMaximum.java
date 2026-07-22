package Day2;

public class IndexFirstMaximum {
    public static void main(String[] args) {

        int[] numbers = {5,2,6,9,7,4,3,6,8,9,6};

        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимум: " + maxValue);
        System.out.println("Индекс: " + maxIndex);
    }
}
