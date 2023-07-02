package com.srihariapi.LoginVerify.service;


import com.srihariapi.LoginVerify.model.User;
import com.srihariapi.LoginVerify.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;



    public User getLoginByEmail(String email) {
        return loginRepository.findByEmail(email);
    }

    public User getLoginById(Long id) {
        return loginRepository.findById(id).orElse(null);
    }

    public User createLogin(User user) {
        return loginRepository.save(user);
    }
}

