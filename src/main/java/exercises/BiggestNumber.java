package exercises;

import java.util.Scanner;

public class BiggestNumber {
    public int biggestNum;

    public void calculateBiggestNum () {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = console.nextInt();
        System.out.print("\nВведите второе число: ");
        int num2 = console.nextInt();
        System.out.print("\nВведите третье число: ");
        int num3 = console.nextInt();
        System.out.println();

        if (num1 > num2){
            biggestNum = num1;
        } else {
            biggestNum = num2;
        }

        if (biggestNum < num3) {
            biggestNum = num3;
        }

        System.out.println("число " + biggestNum + " самое большое из трех");
    }
}
