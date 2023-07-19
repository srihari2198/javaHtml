package com.srihari.restdemo.controller;

import com.srihari.restdemo.entity.Submission;
import com.srihari.restdemo.model.SubmissionDTO;
import com.srihari.restdemo.service.SubmissionEntityService;
import com.srihari.restdemo.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/submit")
public class SubmissionEntityController {

    @Autowired
    private SubmissionEntityService submissionService;

    @GetMapping("get/{id}")
    public ResponseEntity<Submission> getSubmission(@PathVariable  long id) {

        Optional<Submission> response = submissionService.getSubmission(id);

        if(response.isPresent())
        return ResponseEntity.status(200).body(response.get());


        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);


    }

    @GetMapping("/getAll")
    public List<Submission> getAll(){
        return submissionService.getAll();
    }

    @PostMapping(path="/add")
    public ResponseEntity<Submission> addSubmission(@RequestBody Submission submission) {
        ResponseEntity<Submission> re= new ResponseEntity<>(HttpStatus.CREATED);
        re=ResponseEntity.status(re.getStatusCode()).body(submissionService.addSubmission(submission));

        return re;

    }

    @PutMapping("/update")
    public Submission updateSubmission( @RequestBody Submission submission) {
        return  submissionService.updateSubmission(submission);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteSubmission(@PathVariable long id) {
        submissionService.deleteSubmission(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null) ;

    }

}
