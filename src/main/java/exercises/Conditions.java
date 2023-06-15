package exercises;

import java.util.Scanner;

public class Conditions {

    public void NegativeNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");

        int number = scan.nextInt();
        System.out.println();
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else if (number == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.println("Число положительное");
        }
    }
}
