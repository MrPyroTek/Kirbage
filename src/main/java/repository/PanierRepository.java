package repository;

import data.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PanierRepository extends JpaRepository<Integer, Long> {

    List<Panier> findAllPaniersByVille(String x);



}