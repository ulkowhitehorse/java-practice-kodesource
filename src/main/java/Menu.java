import java.util.Scanner;
// http://www.kodesource.top/java-exercises/conditional-statement/index.php

public class Menu {
    final String exit = "exit";

    public void chooseMenu(int number){
        switch (number)
        {
            case 1:
                Conditions conditions = new Conditions();
                conditions.NegativeNumbers();
                break;
            case 2:
                QuadraticEquations quadratic = new QuadraticEquations();
                quadratic.calculateRoots();
                break;
            case 3:
                BiggestNumber biggestNumber = new BiggestNumber();
                biggestNumber.calculateBiggestNum();
                break;
            case 4:
                AbsoluteNumber absoluteNumber = new AbsoluteNumber();
                absoluteNumber.calculateAbsoluteNumber();
                break;
            default:
                System.out.println("Такого упражнения нет");
                break;
        }
    }

    public void printMenu(){
        System.out.println("#1:");
        System.out.println("Напишите программу на Java, чтобы получить число от пользователя, и распечатайте, является ли оно положительным или отрицательным.");
        System.out.println("\n#2:");
        System.out.println("Напишите программу на Java для решения квадратных уравнений");
        System.out.println("\n#3:");
        System.out.println("Возьмите три цифры у пользователя и напечатайте наибольшее число.");
        System.out.println("\n#4:");
        System.out.println("Напишите программу на Java, которая читает число с плавающей запятой и печатает «ноль», если число равно нулю. В противном случае выведите «положительный» или «отрицательный». Добавьте «маленький», если абсолютное значение числа меньше 1, или «большой», если он превышает 1 000 000.");
    }
}
