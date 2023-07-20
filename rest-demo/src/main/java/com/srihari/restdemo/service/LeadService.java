package com.srihari.restdemo.service;

import com.srihari.restdemo.dto.LeadDetailDTO;
import com.srihari.restdemo.entity.LeadDetail;
import com.srihari.restdemo.entity.Submission;

import java.util.List;
import java.util.Optional;

public interface LeadService {

    Optional<LeadDetail> getLeadDetail(long id);

    LeadDetail addLeadDetail(LeadDetailDTO submission);

    LeadDetail updateLeadDetail(LeadDetail submission);

    void deleteLeadDetail(long id);


    List<LeadDetail> getAll();
}
