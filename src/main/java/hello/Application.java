package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/Login")
	public String Login() {
		return "index";
	}

	@PostMapping("/Login")
	public String Co() {
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