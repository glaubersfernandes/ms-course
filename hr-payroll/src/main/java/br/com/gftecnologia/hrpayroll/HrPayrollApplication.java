package br.com.gftecnologia.hrpayroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@EnableFeignClients
@RestController
@SpringBootApplication
public class HrPayrollApplication {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;
	
	@GetMapping
	String home() {
		return "Bem-vindo ao HR-Payroll";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
