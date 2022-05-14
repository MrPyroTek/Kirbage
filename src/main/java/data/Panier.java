package data;

import javax.persistence.*;

@Entity
@Table(name = "paniers")
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String description, categorie, ville;
    int prix;


}
