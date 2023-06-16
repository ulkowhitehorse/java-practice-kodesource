package exercises;
import exercises.help.*;

public class Triangle {

    private static final String textToUser = "Введите количество строк для треугольника";

    public void printRightTriangleNumbersInOrder(){
        inputFromUser input = new inputFromUser();
        int numberOfRows = input.inputInteger(textToUser);

        for (int i = 0; i <= numberOfRows; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printRightTriangleNumbersInRow(){
        inputFromUser input = new inputFromUser();
        int numberOfRows = input.inputInteger(textToUser);

        for (int i = 1; i <= numberOfRows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
