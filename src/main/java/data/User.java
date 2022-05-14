package data;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "commercants")
public class User extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    List<Panier> commandes;

    public User() {
        super();
    }

    public User(String email, String password) {
        super(email, password);
    }

    public void addCommande(Panier p){
        commandes.add(p);
    }
    public List<Panier> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Panier> commandes) {
        this.commandes = commandes;
    }
}
