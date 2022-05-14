package metier;

import data.Panier;
import data.Personne;

import java.util.List;

public interface IListeMetier {
    public List<Panier> listerPaniers(Personne pe);
    public void ajouter(Panier pa, Personne pe);
}
