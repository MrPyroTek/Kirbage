package repository;

import data.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface personneRepository extends JpaRepository<Integer, Long> {


    //static List<Personne> findPersonneByEmailAndPassword(String Email, String Password);
}