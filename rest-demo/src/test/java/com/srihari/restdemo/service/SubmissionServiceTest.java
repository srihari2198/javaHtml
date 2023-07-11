package com.srihari.restdemo.service;

import com.srihari.restdemo.model.SubmissionDTO;
import com.srihari.restdemo.repo.SubmissionRepoClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SubmissionServiceTest {
    @Mock
    SubmissionRepoClass sRepo;

    @InjectMocks
    SubmissionServiceImp sServ;


   @Test
    public void test_getSubmission(){
       SubmissionDTO mockSubmission = getSubmission("25-1-2023","narain","java","Uday","pavan");

       when(sRepo.getSubmission("id-1")).thenReturn(mockSubmission);

       SubmissionDTO result = sServ.getSubmission("id-1");

       Assertions.assertNotNull(result);
       Assertions.assertEquals("narain",result.getSalesPersonName());
   }

   @Test
   public void test_addSubmission(){
       SubmissionDTO mockSubmission = getSubmission("25-1-2023","narain","java","Uday","pavan");

       when(sRepo.addSubmission(mockSubmission)).thenReturn(mockSubmission);

       SubmissionDTO result = sServ.addSubmission(mockSubmission);

       Assertions.assertNotNull(result);
       Assertions.assertEquals("narain",result.getSalesPersonName());
   }

    @Test
    public void test_delSubmission(){
        SubmissionDTO mockSubmission = getSubmission("25-1-2023","narain","java","Uday","pavan");

        when(sRepo.deleteSubmission("narain")).thenReturn(true);

        boolean result = sServ.deleteSubmission("narain");

        Assertions.assertTrue(result);
    }

    @Test
    public void test_updateSubmission(){
        SubmissionDTO mockSubmission = getSubmission("25-1-2023","narain","java","Uday","pavan");

        when(sRepo.updateSubmission(mockSubmission)).thenReturn(mockSubmission);

        SubmissionDTO result = sServ.updateSubmission(mockSubmission);

        Assertions.assertNotNull(result);
    }



    public static SubmissionDTO getSubmission(String date, String salesPersonName, String technology, String vendorName, String consultantName){
        SubmissionDTO dto = new SubmissionDTO();
        dto.setSubmissionDate(date);
        dto.setSalesPersonName(salesPersonName);
        dto.setTechnology(technology);
        dto.setVendorName(vendorName);
        dto.setConsultantName(consultantName);
        return dto;
    }
}
