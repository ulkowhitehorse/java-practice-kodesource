package exercises;

import exercises.help.InputFromUser;

public class TriangleFloyd {

    public void printTriangle() {
        InputFromUser input = new InputFromUser();
        int numRows = input.inputInteger("Введите количество строк в треугольнике Флойда");

        boolean isZero = false;

        for (int i = 0; i < numRows; i++){
            int endSymbol = i + 1;
            do {
                if (!isZero) {
                    System.out.print("1");
                    isZero = true;
                    endSymbol --;
                } else {
                    System.out.print("0");
                    isZero = false;
                    endSymbol--;
                }
            } while (endSymbol != 0);
            System.out.println();
            if (isZero)
                isZero = false;
            else {
                isZero = true;
            }
        }
    }
}
