package Day3;

public class StringLength {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println("Колличество символом строки ровно; " + word.length());
        System.out.println("Первый сиввол строки; " + word.charAt(0));
        System.out.println("Последний сиввол строки; " + word.charAt(word.length() -1));
    }
}
