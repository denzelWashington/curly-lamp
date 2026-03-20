package com.example.demo;

import java.io.Serializable;

public class PatientService{

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public Patient getPatientById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
