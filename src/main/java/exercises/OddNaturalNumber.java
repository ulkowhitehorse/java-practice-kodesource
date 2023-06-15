package exercises;

import java.util.Scanner;

public class OddNaturalNumber {
    public void printOddNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество терминов натуральных чисел:");
        int termins = console.nextInt();
        System.out.println("Нечетные числа:");
        for (int i = 1; i < termins * 2; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
