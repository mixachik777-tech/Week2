package Day6;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя ученика: ");
        String name = scanner.nextLine();

        System.out.print("Введите предмет: ");
        String study = scanner.nextLine();

        System.out.print("Введите количество оценок: ");
        int count = scanner.nextInt();

        int[] evaluations = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Введите оценку номер " + (i + 1) + ": ");
            evaluations[i] = scanner.nextInt();
        }

        DataProcessing dataProcessing = new DataProcessing();

        System.out.println();
        System.out.println("Ученик: " + name + ", предмет: " + study);

        dataProcessing.outputAllRatings(evaluations);

        double average = dataProcessing.averageScore(evaluations);
        System.out.printf("Средний балл: %.2f%n", average);

        dataProcessing.findMaximum(evaluations);
        dataProcessing.findMinimum(evaluations);
        dataProcessing.qualityStudy(evaluations);

        String result = dataProcessing.getResult(average);
        System.out.println("Итоговый статус успеваемости по предмету " + study + ": " + result);

        scanner.close();
    }
}

class DataProcessing {
    public void outputAllRatings(int[] number) {
        System.out.print("Все оценки: ");
        for (int x : number) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public double averageScore(int[] number) {
        int sum = 0;
        for (int x : number) {
            sum += x;
        }
        return (double) sum / number.length;
    }

    public void findMaximum(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Максимальная оценка: " + max);
    }

    public void findMinimum(int[] number) {
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("Минимальная оценка: " + min);
    }

    public void qualityStudy(int[] number) {
        int numberOfFives = 0;
        int belowThree = 0;

        for (int x : number) {
            if (x == 5) {
                numberOfFives++;
            } else if (x < 3) {
                belowThree++;
            }
        }

        System.out.println("Количество пятерок: " + numberOfFives);
        System.out.println("Количество оценок ниже трёх: " + belowThree);
    }

    public String getResult(double average) {
        if (average >= 4.5) {
            return "Отлично";
        } else if (average >= 3.5) {
            return "Нормально";
        } else {
            return "Нужно подтянуть";
        }
    }
}
