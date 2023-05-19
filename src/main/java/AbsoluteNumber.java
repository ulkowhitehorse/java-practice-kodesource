import java.util.Scanner;

public class AbsoluteNumber {
    public void calculateAbsoluteNumber() {
        Scanner console = new Scanner (System.in);
        System.out.print("Введите число: ");
        System.out.println();

        double num = console.nextDouble();

        double absolute = Math.abs(num);
        String addText = "";

        if (absolute < 1) {
            addText = " маленькое";
        } else if (absolute > 1000000){
            addText = " большое";
        }

        if (num == 0.0) {
            System.out.println("Входное значение:" + num);
            System.out.println("число ноль");
        } else if (num < 0.0) {
            System.out.println("Входное значение:" + num);
            System.out.println("отрицательное число" + addText);
        } else if (num > 0.0) {
            System.out.println("Входное значение:" + num);
            System.out.println("положительное число" + addText);
        }

    }
}
