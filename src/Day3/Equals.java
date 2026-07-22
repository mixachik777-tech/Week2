package Day3;

public class Equals {
    public static void main(String[] args) {
        String word = "Hello, I am Groot";
        String word1 = "Hello, I am Star Lord";

        if (word.equals(word1)) {
            System.out.println("Ровны");
        } else System.out.println("Не ровны");

        System.out.printf("Переменная %s меньше чем переменная %s, поэтому резальтат: " + word.compareTo(word1), word, word1);

    }
}
