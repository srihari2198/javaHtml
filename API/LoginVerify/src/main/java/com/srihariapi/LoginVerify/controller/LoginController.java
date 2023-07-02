package com.srihariapi.LoginVerify.controller;


//import com.srihariapi.loginCheck.service.LoginService;
import com.srihariapi.LoginVerify.model.Submission;
import com.srihariapi.LoginVerify.model.User;
import com.srihariapi.LoginVerify.service.LoginService;
import com.srihariapi.LoginVerify.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    List<User> l=new ArrayList();


    @Autowired
  private LoginService loginService;

    @Autowired
    public SubmissionService submissionService;

    @GetMapping(path = "/getAll")
    public List<Submission> getSubmissions(){
        List<Submission> l= submissionService.getAllSubmissions();



        return l;
    }

    @PostMapping(path = "/addSubmission")
    public boolean addSubmission(@RequestBody Submission s){
        submissionService.createSubmission(s);
        return true;
    }

    @GetMapping(path = "/getUser")
    public User getDetails(String email){
        User u = loginService.getLoginByEmail(email);



        return u;
    }
    @PostMapping(path = "/checkUser")
    public boolean checkDetails(@RequestBody User details) {
        boolean result = false;
        User user1 = loginService.getLoginByEmail(details.getEmail());

            if (user1!=null && user1.getPassword().equals(details.getPassword()) ){
                result = true;
            }






        return result;
    }
    @PostMapping(path = "/addUser")

    public boolean addUser(@RequestBody User details) {

        loginService.createLogin(details);

        return true;
    }






}

