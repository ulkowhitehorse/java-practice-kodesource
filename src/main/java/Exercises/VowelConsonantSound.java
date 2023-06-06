package Exercises;

import java.util.Scanner;

public class VowelConsonantSound {

    public void checkSound() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите букву:");
        String sound = console.nextLine();
        System.out.println();
        if (sound.length() > 1) {
            System.out.println("Введено больше одного символа");
        } else if (sound.matches("\\d")){
            System.out.println("Введено число");
        } else if (sound.matches("(?i)[аеёиоуыэюя]")) {
            System.out.println("Входное письмо является гласным");
        } else if (sound.matches("(?i)[бвгдзклмнпрстфх]")){
            System.out.println("Входное письмо является согласным");
        }

    }
}
