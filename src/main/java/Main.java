
import dao.ReadOutcomDAO;
import ui.InputOutcome;
import ui.OutputOutcome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ReadOutcomDAO readOutcomDAO = new ReadOutcomDAO();
        InputOutcome inputOutcome = new InputOutcome();
        OutputOutcome outputOutcome = new OutputOutcome(readOutcomDAO);

        int menuNumber;

        do {
            System.out.println("Co chcesz zrobić?: \n 1 - dodaj wydatek \n 2 - wczytaj wydatki: \n 3 - dodaj przychód \n " +
                    "4 - wczytaj przychody \n 5 - EXIT");

            menuNumber = scanner.nextInt();
            scanner.nextLine();

            switch (menuNumber) {
                case 1: {
                    inputOutcome.inputOutcome();
                    break;
                }
                case 2: {
                    outputOutcome.getAllOutcome();
                    break;
                }
                case 3: {
                    System.out.println("Sorry, ale jeszcze nie działa");
                    break;
                }
                case 4: {
                    System.out.println("To też nie działa");
                    break;
                }
                case 5: {

                }
            }
        } while (menuNumber != 5);

    }
}
