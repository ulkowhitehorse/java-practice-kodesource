package exercises;

import java.util.Scanner;

public class Averages {
    public void calculateAverage() {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Введите число %d: ", i);
            sum += console.nextInt();

        }
        average = sum * 1.0 / 5.0;
        System.out.println("\nОТВЕТ\nСумма чисел = " + sum);
        System.out.println("Среднее чисел = " + average);
    }
}
