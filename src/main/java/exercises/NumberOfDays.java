package exercises;

import java.time.Month;
import java.util.Scanner;

public class NumberOfDays {
    String month;

    public void calculateDaysInMonth() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = console.nextInt();
        System.out.println();
        System.out.print("Введите год: ");
        int year = console.nextInt();
        System.out.println();

        System.out.println("Количество дней в " + getMonth(java.time.LocalDate.of(year, month, 1).getMonth())
                + " " + year + " года "
                + java.time.LocalDate.of(year, month, 1).lengthOfMonth());
    }

    public String getMonth(Month month){
        switch (month.getValue()) {
            case 1 -> this.month = "январе";
            case 2 -> this.month = "феврале";
            case 3 -> this.month = "марте";
            case 4 -> this.month = "апреле";
            case 5 -> this.month = "мае";
            case 6 -> this.month = "июне";
            case 7 -> this.month = "июле";
            case 8 -> this.month = "августе";
            case 9 -> this.month = "сентябре";
            case 10 -> this.month = "октябре";
            case 11 -> this.month = "ноябре";
            case 12 -> this.month = "декабре";
            default -> this.month = "неизвестном месяце";
        }


        return this.month;
    }
}
