package br.com.gftecnologia.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gftecnologia.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
