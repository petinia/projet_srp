package model;

// pour Représenter le badge de l employee avec son niveau d'accès.
public class Badge {
    private final int niveau;

    public Badge(int niveau) {
        this.niveau = niveau;
    }

    public int getNiveau() {
        return niveau;
    }
}