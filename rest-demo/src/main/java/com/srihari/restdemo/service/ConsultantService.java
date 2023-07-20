package com.srihari.restdemo.service;

import com.srihari.restdemo.dto.ConsultantDetailDTO;
import com.srihari.restdemo.entity.ConsultantDetail;

import java.util.List;
import java.util.Optional;

public interface ConsultantService {
    Optional<ConsultantDetail> getConsultantDetail(long id);

   // ConsultantDetail addConsultantDetail(ConsultantDetail consultantDetail);

    ConsultantDetail addConsultantDetail(ConsultantDetailDTO consultantDetail);

    ConsultantDetail updateConsultantDetail(ConsultantDetail consultantDetail);

    void deleteConsultantDetail(long id);

    List<ConsultantDetail> getAll();
}
