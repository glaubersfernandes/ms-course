package br.com.gftecnologia.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.gftecnologia.hrpayroll.entities.Payment;
import br.com.gftecnologia.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	public RestTemplate restTemplate;

	public PaymentService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Value("${hr-worker.host}")
	private String workerHost;

	public Payment getPayment(Long workerId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", workerId.toString());

		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
