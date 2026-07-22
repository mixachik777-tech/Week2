package Day3;

public class StringLength {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println("Количество символов строки равно: " + word.length());
        System.out.println("Первый символ строки: " + word.charAt(0));
        System.out.println("Последний символ строки: " + word.charAt(word.length() - 1));
    }
}
