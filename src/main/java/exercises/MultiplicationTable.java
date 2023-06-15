package exercises;

import java.util.Scanner;

public class MultiplicationTable {
    public void printMultiplicationTable(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");

        int member = console.nextInt();

        for (int i = 0; i <= member; i++){
            System.out.printf("%d X %d = %d\n", member, i, member * i);
        }


    }
}
