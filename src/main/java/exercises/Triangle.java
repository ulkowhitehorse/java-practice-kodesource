package exercises;
import exercises.help.*;

public class Triangle {

    private static final String textToUser = "Введите количество строк для треугольника";

    public void printRightTriangleNumbersInOrder(){
        InputFromUser input = new InputFromUser();
        int numberOfRows = input.inputInteger(textToUser);

        for (int i = 0; i <= numberOfRows; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printRightTriangleNumbersInRow(){
        InputFromUser input = new InputFromUser();
        int numberOfRows = input.inputInteger(textToUser);

        for (int i = 1; i <= numberOfRows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void printRightTriangleNumbersInRowPlusOne(){
        InputFromUser input = new InputFromUser();
        int numberOfRows = input.inputInteger(textToUser);
        int serialNumber = 1;

        for (int i = 0; i <= numberOfRows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(serialNumber);
                serialNumber++;
            }
            System.out.println();
        }
    }
}
