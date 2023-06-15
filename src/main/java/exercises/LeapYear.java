package exercises;

import java.util.Scanner;

public class LeapYear {
    public void checkYear() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = console.nextInt();
        System.out.println();

        if (year % 100 != 0 && year % 4 == 0){
            System.out.println("Этот год високосный (в нем есть 29 февраля. Год делится на 4 и не делится на 100.");
        } else {
            System.out.println("Это не високосный год");
        }
    }
}
