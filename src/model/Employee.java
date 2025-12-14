package model;

// pour Représenter un employé. Implémente la Composition avec le Badge.
public class Employee {
    private final String nom;
    private final Badge badge; 

    public Employee(String nom, int niveauBadge) {
        this.nom = nom;
        // (Le Badge appartient entièrement à l Employee)
        this.badge = new Badge(niveauBadge); 
    }

    public String getNom() {
        return nom;
    }

    public Badge getBadge() {
        return badge;
    }
}