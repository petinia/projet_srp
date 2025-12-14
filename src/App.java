import model.Door;
import model.Employee;
import service.AccessLog;
import service.AccessValidator;
import service.Building;

public class App {
    public static void main(String[] args) {
        // 1. Initialisation des services (SRP)
        AccessLog monJournal = new AccessLog();
        AccessValidator monValidateur = new AccessValidator(monJournal);
        
        // 2. Création des employés (Composition)
        Employee taty = new Employee("taty", 5); 
        Employee petinia = new Employee("petinia", 2); 
        Employee michelle = new Employee("michelle", 2); 

        // 3. Création des portes et du bâtiment (Agrégation)
        Door porteBureau = new Door("P01", 3);
        Door porteServeur = new Door("P02", 5); 
        
        Building monBatiment = new Building();
        monBatiment.ajouterPorte(porteBureau); 
        monBatiment.ajouterPorte(porteServeur);

        // 4. Scénario de tests d'accès
        
        monValidateur.verifier(taty, porteBureau); 
        monValidateur.verifier(petinia, porteBureau); 
        monValidateur.verifier(michelle, porteServeur); 
        
    
    }
}