package br.com.gftecnologia.hrworker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

import br.com.gftecnologia.hrworker.resources.GreetingController;

@RestController
@SpringBootApplication
public class HrWorkerApplication implements GreetingController {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping("/")
	String home() {
		return "Bem-vindo ao hr-worker!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HrWorkerApplication.class, args);
	}

	@Override
	public String greeting() {
		return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
	}

}
