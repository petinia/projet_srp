package service;

import model.Door;
import model.Employee;

//  la vérification de la règle d'accès.
public class AccessValidator {
    private final AccessLog journal; 

    public AccessValidator(AccessLog journal) {
        this.journal = journal;
    }

    public boolean verifier(Employee employe, Door porte) {
        int niveauEmploye = employe.getBadge().getNiveau();
        int niveauPorte = porte.getNiveauRequis();
        
        // La règle d'accès(niveau de l'employé doit être strictement supérieur au niveau requis)
        if (niveauEmploye > niveauPorte) {
            journal.enregistrerAutorise(employe, porte);
            return true;
        } else {
            journal.enregistrerRefuse(employe, porte);
            return false;
        }
    }
}