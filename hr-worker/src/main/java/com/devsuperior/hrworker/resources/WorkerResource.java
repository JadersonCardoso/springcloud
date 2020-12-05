package com.devsuperior.hrworker.resources;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.respository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Access;
import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository repository;

    @GetMapping
    private ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Worker> findAll(@PathVariable Long id){
        Worker obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }



}
