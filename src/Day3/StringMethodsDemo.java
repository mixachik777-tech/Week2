package Day3;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String word = "   Hello, World   ";

        System.out.println("Исходная строка (в кавычках): \"" + word + "\"");

        System.out.println("toLowerCase(): " + word.toLowerCase());
        System.out.println("toUpperCase(): " + word.toUpperCase());

        String trimmed = word.trim();
        System.out.println("trim() (в кавычках): \"" + trimmed + "\"");

        System.out.println("substring(0, 5) от обрезанной строки: " + trimmed.substring(0, 5));
        System.out.println("substring(7) от обрезанной строки: " + trimmed.substring(7));
    }
}
