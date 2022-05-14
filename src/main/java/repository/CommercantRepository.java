package repository;

import data.Commercant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommercantRepository extends JpaRepository<Integer, Long> {

List<Commercant> findAllCommercants();


}