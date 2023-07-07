package com.srihari.restdemo.service;

import com.srihari.restdemo.model.SubmissionDTO;

import java.util.List;

public interface SubmissionService {
    SubmissionDTO getSubmission(String id);

    SubmissionDTO addSubmission(SubmissionDTO submission);

    SubmissionDTO updateSubmission(SubmissionDTO submission);

    SubmissionDTO deleteSubmission(String id);

    List<SubmissionDTO> getAll();

}
