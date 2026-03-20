package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.net.Socket;

// Patient.java
@Getter
@Setter
public class Patient implements Serializable {
    private Long id;
    private String name;


    public Patient(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}

