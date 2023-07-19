package com.srihari.restdemo.controller;

import com.srihari.restdemo.entity.LeadDetail;
import com.srihari.restdemo.entity.Submission;
import com.srihari.restdemo.model.SubmissionDTO;
import com.srihari.restdemo.service.LeadService;
import com.srihari.restdemo.service.SubmissionEntityService;
import com.srihari.restdemo.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lead")
public class LeadController {

    @Autowired
    private LeadService service;

    @GetMapping("get/{id}")
    public ResponseEntity<LeadDetail> getSubmission(@PathVariable  long id) {

        Optional<LeadDetail> response = service.getLeadDetail(id);

        if(response.isPresent())
            return ResponseEntity.status(200).body(response.get());


        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);


    }

    @GetMapping("/getAll")
    public List<LeadDetail> getAll(){
        return service.getAll();
    }

    @PostMapping(path="/add")
    public ResponseEntity<LeadDetail> addSubmission(@RequestBody LeadDetail submission) {
        ResponseEntity<LeadDetail> re= new ResponseEntity<>(HttpStatus.CREATED);
        re=ResponseEntity.status(re.getStatusCode()).body(service.addLeadDetail(submission));

        return re;

    }

    @PutMapping("/update")
    public LeadDetail updateSubmission( @RequestBody LeadDetail submission) {
        return  service.updateLeadDetail(submission);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSubmission(@PathVariable long id) {
        service.deleteLeadDetail(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build() ;

    }

}
