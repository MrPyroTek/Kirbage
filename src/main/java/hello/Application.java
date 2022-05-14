package hello;

import data.Personne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.orm.jpa.vendor.Database;
import repository.personneRepository;
import repository.UserRepository;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@SpringBootApplication
@Controller
public class Application {

	public void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/Login")
	public String Login() {
		return "index";

	}

	@PostMapping("/Login")
	public String Test(@RequestParam String email,@RequestParam String password) {
		System.out.print(email+password);
		//personneRepository.findPersonneByEmailAndPassword(email,password);
		return "liste-panier";
	}

	@GetMapping("/signin")
	public String SignIn() {
		return "signin";
	}
	@GetMapping("/liste-panier")
	public String liste_paniers() {
		return "liste-panier";
	}


}