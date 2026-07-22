package Day3;

public class SpacesCount {
    public static void main(String[] args) {
        String sentence = "Java с нуля это интересно";

        int spaces = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaces++;
            }
        }

        System.out.println("Строка: " + sentence);
        System.out.println("Количество пробелов в строке: " + spaces);
    }
}
