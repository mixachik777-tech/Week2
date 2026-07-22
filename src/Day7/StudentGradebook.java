package Day7;

import java.util.Scanner;

public class StudentGradebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя ученика: ");
        String studentName = scanner.nextLine();

        System.out.print("Предмет: ");
        String subject = scanner.nextLine();

        System.out.print("Сколько будет оценок: ");
        int gradesCount = scanner.nextInt();

        int[] grades = new int[gradesCount];
        for (int i = 0; i < gradesCount; i++) {
            System.out.print("Оценка " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Успеваемость: " + studentName + " по предмету " + subject);
        printGrades(grades);

        double average = averageScore(grades);
        System.out.printf("Средний балл: %.2f%n", average);
        System.out.println("Максимальная оценка: " + maxGrade(grades));
        System.out.println("Минимальная оценка: " + minGrade(grades));
        System.out.printf("Средний балл без самой слабой оценки: %.2f%n", averageWithoutWorst(grades));
        System.out.println("Итог: " + verdict(average));

        scanner.close();
    }

    public static void printGrades(int[] grades) {
        System.out.print("Все оценки: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    public static double averageScore(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int maxGrade(int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public static int minGrade(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public static double averageWithoutWorst(int[] grades) {
        if (grades.length <= 1) {
            return averageScore(grades);
        }
        int min = minGrade(grades);
        int sum = 0;
        boolean minSkipped = false;
        for (int grade : grades) {
            if (grade == min && !minSkipped) {
                minSkipped = true;
                continue;
            }
            sum += grade;
        }
        return (double) sum / (grades.length - 1);
    }

    public static String verdict(double average) {
        if (average >= 4.5) {
            return "Отлично";
        } else if (average >= 3.5) {
            return "Нормально";
        } else {
            return "Нужно подтянуть";
        }
    }
}
