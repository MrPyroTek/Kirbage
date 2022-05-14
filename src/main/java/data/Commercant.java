package data;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "commercants")
public class Commercant extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String localisation;
    int tel;

    List<Panier> paniers;

    public void addPanier(Panier p){
        paniers.add(p);
    }
    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public List<Panier> getPaniers() {
        return paniers;
    }

    public void setPaniers(List<Panier> paniers) {
        this.paniers = paniers;
    }
}
