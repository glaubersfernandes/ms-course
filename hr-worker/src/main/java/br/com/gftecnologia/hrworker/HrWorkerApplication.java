package br.com.gftecnologia.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HrWorkerApplication {

	@GetMapping("/")
	String home() {
		return "Bem-vindo ao hr-worker!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HrWorkerApplication.class, args);
	}

}
