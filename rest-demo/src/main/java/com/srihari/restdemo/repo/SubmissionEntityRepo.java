package com.srihari.restdemo.repo;

import com.srihari.restdemo.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionEntityRepo extends JpaRepository<Submission,Long> {

}
