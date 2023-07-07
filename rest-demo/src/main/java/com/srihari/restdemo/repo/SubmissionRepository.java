package com.srihari.restdemo.repo;

import com.srihari.restdemo.model.SubmissionDTO;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface SubmissionRepository {

    SubmissionDTO getSubmission(String id);

    List<SubmissionDTO> getAll();
    SubmissionDTO addSubmission(SubmissionDTO submission);
    SubmissionDTO updateSubmission(SubmissionDTO submission);
    SubmissionDTO deleteSubmission(String id);

}
