package com.devsuperior.hrworker.respository;


import com.devsuperior.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
