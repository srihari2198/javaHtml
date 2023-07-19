package com.srihari.restdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ConsultantDetail {
    @Id
    private long id;


    private long leadId;


    private String firstName;


    private String lastName;


    private String emailAddress;


    private String phoneNumber;

}
