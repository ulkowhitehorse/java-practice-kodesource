package exercises;
import exercises.help.InputFromUser;

public class Rhombus {
    private int halfLines; // half lines of rhombus
    private String symbolsOfRhombus;

    public void setSymbolsOfRhombus(String symbol){
        this.symbolsOfRhombus = symbol;
    }

    public String getSymbolsOfRhombus() {
        return symbolsOfRhombus;
    }

    public void setHalfLines(int halfLines){
        this.halfLines = halfLines;
    }

    public int getHalfLines() {
        return halfLines;
    }

    public Rhombus(int halfLines){
        this.halfLines = halfLines;
        this.symbolsOfRhombus = "*";
    }

    public Rhombus(int halfLines, String symbolsOfRhombus) {
        this.halfLines = halfLines;
        this.symbolsOfRhombus = symbolsOfRhombus;
    }

    public void printRhombus() {
        int maxNumberSymbolsInRow = halfLines * 2 - 1;
        int currentNumberSymbols = 1;
        int startCurrentNumberSymbols = 1;
        int currentNumberSpaces = maxNumberSymbolsInRow - currentNumberSymbols;
        int halfNumberSpaces = currentNumberSpaces / 2;
        boolean isSpace = true;

        for (int i = 0; i < halfLines - 1; i++){
            for (int j = 0; j < maxNumberSymbolsInRow; j++){
                if (isSpace){
                    System.out.print(" ");
                    currentNumberSpaces--;
                    if (currentNumberSpaces != halfNumberSpaces){
                        isSpace = true;
                    } else
                        isSpace = false;
                } else {
                    System.out.print(symbolsOfRhombus);
                    currentNumberSymbols--;
                    if (currentNumberSymbols == 0) {
                        isSpace = true;
                    }
                }
            }
            if (currentNumberSymbols != maxNumberSymbolsInRow) {
                System.out.println();
                startCurrentNumberSymbols += 2;
                currentNumberSymbols = startCurrentNumberSymbols;
                currentNumberSpaces = maxNumberSymbolsInRow - currentNumberSymbols;
                halfNumberSpaces = currentNumberSpaces / 2;
            }
        }


        isSpace = true;
        currentNumberSymbols = maxNumberSymbolsInRow - 4;
        startCurrentNumberSymbols = currentNumberSymbols;
        currentNumberSpaces = maxNumberSymbolsInRow - currentNumberSymbols;
        halfNumberSpaces = currentNumberSpaces / 2;

        for (int i = 0; i < halfLines - 2; i++) {
            for (int j = 0; j < maxNumberSymbolsInRow; j++) {
                if (isSpace){
                    System.out.print(" ");
                    currentNumberSpaces--;
                    if (currentNumberSpaces == halfNumberSpaces) {
                        isSpace = false;
                    } else
                        isSpace = true;
                } else {
                    System.out.print(symbolsOfRhombus);
                    startCurrentNumberSymbols--;
                    if (startCurrentNumberSymbols != 0){
                        isSpace = false;
                    } else {
                        isSpace = true;
                    }
                }
            }
            System.out.println();
            currentNumberSymbols -= 2;
            startCurrentNumberSymbols = currentNumberSymbols;
            currentNumberSpaces = maxNumberSymbolsInRow - startCurrentNumberSymbols;
            halfNumberSpaces = currentNumberSpaces / 2;
        }

    }

}
