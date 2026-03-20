package com.example.demo;

public class PatientService{

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public Patient getPatientById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
