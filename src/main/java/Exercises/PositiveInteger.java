package Exercises;

import java.util.Scanner;

public class PositiveInteger {
    public void printNumbers() {
        for (int i = 1; i <= 10;  i++){
            System.out.println(i);
        }
    }

    public void printNextIntegerAndSum() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int num = console.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            System.out.print("\n" + i + ", ");
            sum += i;
        }
        System.out.printf("\nСумма %d натуральных чисел равна %d", num, sum);
    }
}
