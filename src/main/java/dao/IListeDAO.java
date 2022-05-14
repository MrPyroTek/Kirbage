package dao;

import data.Panier;
import data.Personne;

import java.util.List;

public interface IListeDAO {
    public List<Panier> findAllPanier();
    public List<Panier> findAllPanier(Personne pe);
    public void add(Panier pa, Personne pe);
}
