package exercises;

import java.util.Scanner;

public class BigNumbers {
    private long num = 0L;

    public BigNumbers() {
        System.out.println("Введите целое положительное число до 10 000 000 000");
        Scanner console = new Scanner(System.in);
        while (num == 0L) {
            num = console.nextLong();
            if (num < 1L) {
                System.out.println("Введите целое положительное число..");
                num = 0L;
            } else if (num > 10000000000L){
                System.out.println("Чило должно быть менее 10 миллиардов");
                num = 0L;
            }
        }
        System.out.println("Вы ввели " + num);
    }

    public void calculateDigitsInNumber() {
        boolean notEnd = true;
        int result = 1;
        long ten = 10L;
        while (notEnd) {
            if (num/ten > 0){
                ten *= 10;
                result++;
            } else {
                notEnd = false;
            }
        }
        System.out.println("Количество цифр в числе " + result);
    }

}
