package br.com.gftecnologia.hrworker.resources;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {

	@RequestMapping("/greeting")
	String greeting();
}
