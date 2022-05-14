package dao;

import data.Commercant;
import data.Panier;
import data.Personne;
import data.User;

import java.util.ArrayList;
import java.util.List;

public class ListeDAOImpl implements IListeDAO {
    private List<Panier> allPaniers = new ArrayList<Panier>();

    @Override
    public List<Panier> findAllPanier() {
        return allPaniers;
    }

    @Override
    public List<Panier> findAllPanier(Personne pe) {
        if (pe instanceof User) {
            return ((User) pe).getCommandes();
        } else if (pe instanceof Commercant) {
            return ((Commercant) pe).getPaniers();
        } else {
            return null;
        }
    }

    @Override
    public void add(Panier pa, Personne pe) {

        if(pe instanceof User){
            ((User) pe).addCommande(pa);
        }else if(pe instanceof Commercant){
            ((Commercant) pe).addPanier(pa);
            allPaniers.add(pa);
        }
    }
}
