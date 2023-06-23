package exercises.help;

import java.util.Scanner;

public class InputFromUser {
    public int inputInteger(String textToUser){
        System.out.print(textToUser + ": ");
        Scanner console = new Scanner(System.in);
        return console.nextInt();

    }
}
