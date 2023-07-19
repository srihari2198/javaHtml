package com.srihari.restdemo.repo;

import com.srihari.restdemo.entity.ConsultantDetail;
import com.srihari.restdemo.entity.LeadDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantRepo extends JpaRepository<ConsultantDetail,Long> {
}
