package exercises;

import exercises.help.InputFromUser;
// Треугольник паскаля упражнение 22
public class TrianglePascal {
    public static void main(String[] args) {
        InputFromUser inputFromUser = new InputFromUser();
        TrianglePascal trianglePascal = new TrianglePascal();
        trianglePascal.printTriangle(3);
    }

    private void printTriangle(int rows) {
        int[] firstRow;
        int[] secondRow;
        int maxSymbolsInRow = rows * 2 - 1;
        boolean isSpace = true;
        int symbol = 1;
        int nextSymbol = 1;
        int defaultSymbol = 1;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < maxSymbolsInRow; j++){
                if (isSpace){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
