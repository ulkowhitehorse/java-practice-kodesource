package exercises;

import exercises.help.inputFromUser;

public class Pyramid {
    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumRows() {
        return numRows;
    }

    private int numRows;

    public void printPyramid(){
        inputFromUser input = new inputFromUser();
        numRows = input.inputInteger("Введите количество строк пирамиды");

        int numAllSymbols = numRows * 2 - 1; // all symbols in past row of pyramid
        int numSymbols; // number of symbols in current row
        int numSpaces; // number of spaces in current row
        int symbol; // what symbol print in current row

        boolean isSpace; // print space in current position
        boolean isSymbol;// print symbol in current position

        int firstSymbolPlace; // place in row for print first symbol

        for (int row = 0; row < numRows; row++) {
            numSymbols = row + 1;
            symbol = numSymbols;
            numSpaces = numAllSymbols - numSymbols;
            firstSymbolPlace = numRows - numSymbols;

            if (numSpaces > numSymbols) {
                isSpace = true;
                isSymbol = false;
            }  else {
                isSpace = false;
                isSymbol = true;
            }

            for (int place = 0; place < numAllSymbols; place++){
                int nextPlace = place + 1;

                if (isSpace){
                    System.out.print(" ");
                    if (numSymbols != 0 && nextPlace >= firstSymbolPlace){
                        isSpace = false;
                        isSymbol = true;
                    }
                }

                if (isSymbol){
                    System.out.print(symbol);
                    numSymbols --;
                    isSymbol = false;
                    isSpace = true;
                }
            }

            System.out.println();
        }



    }

}
