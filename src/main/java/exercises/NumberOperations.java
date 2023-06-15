package exercises;

import java.util.Scanner;

public class NumberOperations {

    private int number;

    public NumberOperations(){
        takeInputNumber();
    }

    public void takeInputNumber(){
        boolean isNumber = false;

        while (!isNumber) {
            System.out.print("\nВведите число: ");
            Scanner console = new Scanner(System.in);
            try {
                number = console.nextInt();
                isNumber = true;
            } catch (Exception ex) {
                System.out.println("Вы ввели не число");
            }
            System.out.println("Введенное число: " + number);
        }
    }

    public void calculateCube() {
        int cube = number * number * number;

        System.out.printf("\nОТВЕТ\nКуб числа %d = %d", number, cube);
    }
}
