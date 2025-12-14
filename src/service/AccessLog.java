package service;

import java.util.ArrayList;
import java.util.List;
import model.Door;
import model.Employee;

// stockage en mémoire des logs
public class AccessLog {
    private final List<String> journal = new ArrayList<>(); 

    public void enregistrerAutorise(Employee employe, Door porte) {
        String log = employe.getNom() + "  accès autorisé à " + porte.getId();
        journal.add(log);
    }

    public void enregistrerRefuse(Employee employe, Door porte) {
        String log = employe.getNom() + "  accès refusé à " + porte.getId();
        journal.add(log);
    }

    public List<String> getJournal() {
        return journal;
    }
}