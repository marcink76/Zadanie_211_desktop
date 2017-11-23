package ui;

import dao.ReadOutcomDAO;
import model.Outcome;

import java.util.ArrayList;
import java.util.List;

public class OutputOutcome {

    private ReadOutcomDAO readOutcomDAO;

    public OutputOutcome(ReadOutcomDAO readOutcomDAO) {
        this.readOutcomDAO = readOutcomDAO;
    }

    private List<Outcome> outcomeList = new ArrayList<>();

    public List<Outcome> getAllOutcome() {
        Outcome outcome;
        long count = 1;
        do {
            outcome = readOutcomDAO.read(count);
            if (outcome == null) break;
            outcomeList.add(outcome);
            System.out.println(outcomeList.get(0).toString());
            count++;
        } while (true);

        return outcomeList;
    }
}
