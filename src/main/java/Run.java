import java.util.Scanner;

public class Run {


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit){
            System.out.println("\n\n!!!! Выберите номер меню. Для выхода введите exit");
            String input = console.nextLine();
            isExit = input.equals("exit");
            if (isExit) break;
            try{
                int number = Integer.parseInt(input);
                menu.chooseMenu(number);
            } catch (Exception e) {
                System.out.println("Некорректный ввод");
            }
        }

    }


}
