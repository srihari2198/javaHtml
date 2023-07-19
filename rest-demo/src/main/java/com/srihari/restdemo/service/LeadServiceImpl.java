package com.srihari.restdemo.service;

import com.srihari.restdemo.entity.LeadDetail;
import com.srihari.restdemo.repo.LeadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeadServiceImpl implements LeadService{

    @Autowired
    private LeadRepo repository;
    @Override
    public Optional<LeadDetail> getLeadDetail(long id) {
        return  repository.findById(id);
    }

    @Override
    public LeadDetail addLeadDetail(LeadDetail submission) {
        return  repository.save(submission);
    }

    @Override
    public LeadDetail updateLeadDetail(LeadDetail leadDetail) {
        Optional<LeadDetail> existingLeadDetail = repository.findById(leadDetail.getId());
        if (existingLeadDetail.isPresent()) {
            LeadDetail updatedLeadDetail = existingLeadDetail.get();
            updatedLeadDetail.setFirstName(leadDetail.getFirstName());
            updatedLeadDetail.setLastName(leadDetail.getLastName());
            updatedLeadDetail.setEmailAddress(leadDetail.getEmailAddress());
            updatedLeadDetail.setPhoneNumber(leadDetail.getPhoneNumber());

            return repository.save(updatedLeadDetail);
        }
        return null;
    }

    @Override
    public void deleteLeadDetail(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<LeadDetail> getAll() {
        return repository.findAll();
    }
}
