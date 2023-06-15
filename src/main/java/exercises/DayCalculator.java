package exercises;

import java.util.Scanner;

public class DayCalculator {
    public void calculateDayByNumber() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер дня");
        int inputNum = console.nextInt();
        switch (inputNum){
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Дня с таким номером не существует");
                break;
        }
    }
}
