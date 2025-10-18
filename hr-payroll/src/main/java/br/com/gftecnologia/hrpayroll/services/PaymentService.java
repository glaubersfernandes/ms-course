package br.com.gftecnologia.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.gftecnologia.hrpayroll.entities.Payment;
import br.com.gftecnologia.hrpayroll.entities.Worker;
import br.com.gftecnologia.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	public WorkerFeignClient workerFeignClient;
	
	public PaymentService(WorkerFeignClient workerFeignClient) {
		this.workerFeignClient = workerFeignClient;
	}

	public Payment getPayment(Long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
