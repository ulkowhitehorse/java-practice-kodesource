import java.util.Scanner;

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
    }
}
