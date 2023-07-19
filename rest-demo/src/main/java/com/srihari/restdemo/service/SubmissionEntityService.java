package com.srihari.restdemo.service;

import com.srihari.restdemo.entity.Submission;
import com.srihari.restdemo.model.SubmissionDTO;

import java.util.List;
import java.util.Optional;

public interface SubmissionEntityService {

    Optional<Submission> getSubmission(long id);

    Submission addSubmission(Submission submission);

    Submission updateSubmission(Submission submission);

    void deleteSubmission(long id);

    List<Submission> getAll();
}
