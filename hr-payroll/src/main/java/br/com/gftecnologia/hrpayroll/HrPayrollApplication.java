package br.com.gftecnologia.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@RestController
@SpringBootApplication
public class HrPayrollApplication {

	@GetMapping
	String home() {
		return "Bem-vindo ao HR-Payroll";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
