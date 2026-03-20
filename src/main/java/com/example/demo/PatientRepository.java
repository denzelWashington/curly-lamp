package com.example.demo;

// PatientRepository.java
import java.util.Optional;

public interface PatientRepository {
    Optional<Patient> findById(Long id);
}
