package com.srihari.restdemo.service;


import com.srihari.restdemo.entity.ConsultantDetail;
import com.srihari.restdemo.repo.ConsultantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultantServiceImpl implements ConsultantService {

    @Autowired
    private  ConsultantRepo repository;




    @Override
    public Optional<ConsultantDetail> getConsultantDetail(long id) {
        return repository.findById(id);
    }

    @Override
    public ConsultantDetail addConsultantDetail(ConsultantDetail consultantDetail) {
        return repository.save(consultantDetail);
    }

    @Override
    public ConsultantDetail updateConsultantDetail(ConsultantDetail consultantDetail) {
        Optional<ConsultantDetail> existingConsultantDetail = repository.findById(consultantDetail.getId());
        if (existingConsultantDetail.isPresent()) {
            ConsultantDetail updatedConsultantDetail = existingConsultantDetail.get();
            updatedConsultantDetail.setLeadId(consultantDetail.getLeadId());
            updatedConsultantDetail.setFirstName(consultantDetail.getFirstName());
            updatedConsultantDetail.setLastName(consultantDetail.getLastName());
            updatedConsultantDetail.setEmailAddress(consultantDetail.getEmailAddress());
            updatedConsultantDetail.setPhoneNumber(consultantDetail.getPhoneNumber());

            return repository.save(updatedConsultantDetail);
        }
        return null;
    }

    @Override
    public void deleteConsultantDetail(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ConsultantDetail> getAll() {
        return repository.findAll();
    }
}


