package model;

// pour Représenter la porte avec son niveau d'accès requis.
public class Door {
    private final String id;
    private final int niveauRequis;

    public Door(String id, int niveauRequis) {
        this.id = id;
        this.niveauRequis = niveauRequis;
    }

    public String getId() {
        return id;
    }

    public int getNiveauRequis() {
        return niveauRequis;
    }
}