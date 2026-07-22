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
            System.out.print("Введите оценку: ");
            evaluations[i] = scanner.nextInt();
        }

        DataProcessing dataProcessing = new DataProcessing();

        System.out.println("Ученик: " + name + ", предмет: " + study);

        dataProcessing.outputAllRatings(evaluations);

        double average = dataProcessing.averageScore(evaluations);
        System.out.println("Средний бал: " + average);

        dataProcessing.findMaximum(evaluations);
        dataProcessing.findMinimum(evaluations);
        dataProcessing.qualityStudy(evaluations);

        String result = dataProcessing.getResult(average);
        System.out.println("Итоговый статус успеваемости: " + result);

        scanner.close();
    }
}

class DataProcessing {
    public void outputAllRatings(int[] number) {
        for (int x : number) {
            System.out.print(x + ", ");
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
        int threeAndBelow = 0;

        for (int x : number) {
            if (x == 5) {
                numberOfFives++;
            } else if (x < 3) {
                threeAndBelow++;
            }
        }

        System.out.println("Количество пятерок: " + numberOfFives);
        System.out.println("Количество оценок ниже трёх: " + threeAndBelow);
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


//что такое массив: это структура данных, которая хранит упорядоченный набор элементов одного типа в области памяти.
//чем индекс отличается от значения: индекс это порядковый номер элемента (начинается с 0), значение это данные, которые лежат по этому номеру.
//чначение это сами данные, которые хранятся по определенному индексу в массиве.
//чем String отличается от char: String это ссылочный тип данных, который не хранит в себе сами данные, а только перенаправляет на ту область выделенной памяти, где данные находятся. char это тип данных для хранения одного знака ('f', 'H', '6', '$').
//почему строки сравнивают через equals: В случае ссылочных типов данных '==' сравнивает ссылки, по которым расположены данные, в то время как equals сравнивает сами данные (символы строк и их порядок).
//выносить логику в методы: 1) для чистоты кода, 2) для стабильной функциональности внутри логики, до которой пользователь не сможет добраться и поломать. Пользователь может взаимодействовать в формате обращения к логике, которая вынесена за main.
//какие граничные случаи нужно проверять: когда входные данные на пределе допустимых значений или выходят за их границы. Их проверка обязательна, чтобы программа работала стабильно и не падала с ошибками.
//Примеры: if (word == null || word.isEmpty()), if (number < 0), if (number == 0), if (arr == null || arr.length == 0).
