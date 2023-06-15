package start;

import java.util.Scanner;

public class Run {


    public static void main(String[] args) {
        Menu menu = new Menu();

        boolean isExit = false;
        boolean isNext = false;
        boolean isPrev = false;
        final int lastPage = 2;
        int pageMenu = 1;
        menu.printMenu(pageMenu);


        while (!isExit){
            Scanner console = new Scanner(System.in);

            System.out.println("\n\n!!!! Выберите номер меню. Для выхода введите exit. ");
            System.out.println("Следующая страница next. Предыдущая страница prev ");
            String input = console.nextLine();

            isExit = input.equals("exit");
            isNext = input.equals("next");
            isPrev = input.equals("prev");

            if (isExit) break;

            if (isNext && pageMenu != lastPage) {
                pageMenu++;
                isNext = false;
                menu.printMenu(pageMenu);
            } else {
                isNext = false;
            }

            if (isPrev && pageMenu > 1){
                pageMenu--;
                isPrev = false;
                menu.printMenu(pageMenu);
            } else {
                isPrev = false;
            }

            if (input.matches("\\b([1-9]|1[0-6])\\b")) {
                int number = Integer.parseInt(input);
                menu.chooseMenu(number);
            }
        }

    }


}
