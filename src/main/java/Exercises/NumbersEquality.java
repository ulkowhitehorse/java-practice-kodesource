package Exercises;

import java.util.Scanner;

public class NumbersEquality {
    public void defineEquality() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое с плавающей запятой: ");
        Double num1 = console.nextDouble();
        System.out.print("\nВведите второе число с плавающей запятой: ");
        Double num2 = console.nextDouble();

        System.out.println();

        if (num1.equals(num2)){
            System.out.println("числа равны");
        } else {
            System.out.println("числа разные");
        }
    }
}
