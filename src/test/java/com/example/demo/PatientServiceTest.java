package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PatientServiceTest {


    @Mock
    PatientRepository repository;


    @InjectMocks
    PatientService patientService;

    @Test
    void testPatientGetById() {
        Patient mockPatient = new Patient(1L, "John Doe");
        when(repository.findById(1L)).thenReturn(Optional.of(mockPatient));
        Patient result = patientService.getPatientById(1L);
        assertNotNull(result);
        //assertEquals("John Doe", result.getName());
        verify(repository, times(1)).findById(1L);


    }


}
