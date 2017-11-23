package ui;

import dao.WriteOutcomDAO;
import model.Outcome;

import java.time.LocalDate;
import java.util.Scanner;

public class InputOutcome {
    public void inputOutcome() {
        Scanner scanner = new Scanner(System.in);
        WriteOutcomDAO writeOutcomDAO = new WriteOutcomDAO();

        String stopValue = "T";
        do {
            System.out.println("Podaj nazwę wydatku: ");
            String type = scanner.nextLine();

            System.out.println("Podaj opis: ");
            String desc = scanner.nextLine();

            System.out.println("Podaj koszt: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            LocalDate localDate = LocalDate.now();
            Outcome outcome = new Outcome(type, desc, amount, localDate);
            writeOutcomDAO.add(outcome);
            System.out.println("Chcesz dodać kolejny wydatek? [Y/N]");
            stopValue = scanner.nextLine();
        } while (stopValue.equals("Y")||stopValue.equals("y"));
    }
}