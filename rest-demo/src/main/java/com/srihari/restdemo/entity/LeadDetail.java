package com.srihari.restdemo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class LeadDetail {

    @Id
    private long id;

    private String firstName;

    private String lastName;

    private String emailAddress;

    private String phoneNumber;
}

