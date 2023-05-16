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
                System.out.println("Введите коэффициент a:");
                Scanner console = new Scanner(System.in);
                double a = console.nextDouble();
                System.out.println("Введите коэффициент b:");
                double b = console.nextDouble();
                System.out.println("Введите коэффициент c:");
                double c = console.nextDouble();
                quadratic.calculateRoots(a, b, c);
                break;
            default:
                System.out.println("Такого упражнения нет");
        }
    }

    public void printMenu(){
        System.out.println("#1:");
        System.out.println("Напишите программу на Java, чтобы получить число от пользователя, и распечатайте, является ли оно положительным или отрицательным.");
        System.out.println("\n#2:");
        System.out.println("Напишите программу на Java для решения квадратных уравнений");
    }
}
