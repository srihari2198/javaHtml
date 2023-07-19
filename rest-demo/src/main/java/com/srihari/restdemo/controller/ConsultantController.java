package com.srihari.restdemo.controller;

import com.srihari.restdemo.entity.ConsultantDetail;
import com.srihari.restdemo.service.ConsultantService;
import com.srihari.restdemo.service.ConsultantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consultant")
public class ConsultantController {

    @Autowired
    private ConsultantServiceImpl service;

    @GetMapping("/get/{id}")
    public ResponseEntity<ConsultantDetail> getConsultantDetail(@PathVariable long id) {
        Optional<ConsultantDetail> response = service.getConsultantDetail(id);
        if (response.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(response.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }



    @GetMapping("/getAll")
    public List<ConsultantDetail> getAllConsultantDetails() {
        return service.getAll();
    }



    @GetMapping("/getByName/{name}")
    public List<ConsultantDetail> getAllByName(@PathVariable String name) {
        return service.getByFirstName(name);
    }

    @PostMapping("/add")
    public ResponseEntity<ConsultantDetail> addConsultantDetail(@RequestBody ConsultantDetail consultantDetail) {
        ConsultantDetail savedConsultantDetail = service.addConsultantDetail(consultantDetail);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedConsultantDetail);
    }

    @PutMapping("/update")
    public ResponseEntity<ConsultantDetail> updateConsultantDetail(@RequestBody ConsultantDetail consultantDetail) {
        ConsultantDetail updatedConsultantDetail = service.updateConsultantDetail(consultantDetail);
        if (updatedConsultantDetail != null) {
            return ResponseEntity.status(HttpStatus.OK).body(updatedConsultantDetail);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteConsultantDetail(@PathVariable long id) {
        service.deleteConsultantDetail(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

