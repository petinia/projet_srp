package service;

import java.util.ArrayList;
import java.util.List;
import model.Door;

// Gérer la collection des portes. Implémente l'Agrégation avec Door.
public class Building {
    private final List<Door> portes = new ArrayList<>(); 

    public void ajouterPorte(Door porte) {
        // Agrégation : la porte est ajoutée, mais elle peut exister en dehors du Building.
        portes.add(porte);
    }

    public Door trouverPorteParId(String id) {
        for (Door p : portes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; 
    }
}