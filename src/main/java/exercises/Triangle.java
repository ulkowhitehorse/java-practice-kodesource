package exercises;
import exercises.help.*;

public class Triangle {
    public void printTriangle(){
        inputFromUser input = new inputFromUser();
        String print = "Введите количество строк для треугольника";
        int str = input.inputInteger(print);
        for (int i = 0; i <= str; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
