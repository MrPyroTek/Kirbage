package metier;

import dao.IListeDAO;
import data.Panier;
import data.Personne;

import java.util.List;

public class ListeMetierImpl implements IListeMetier{
    private IListeDAO dao;

    @Override
    public List<Panier> listerPaniers(Personne pe) {
        return dao.findAllPanier(pe);
    }

    @Override
    public void ajouter(Panier pa, Personne pe) {
        dao.add(pa,pe);
    }
}
