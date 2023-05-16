import java.util.Scanner;

public class Conditions {

    public void chooseExercise(int exercise){
        switch (exercise)
        {
            case 35:
                NegativeNumbers();
                break;
            default:
                System.out.println("Такого упражнения нет, выберите другое");
                break;
        }
    }

    public void NegativeNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("Число отрицательное");
        } else if (number == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.println("Число положительное");
        }
    }
}
