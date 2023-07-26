package com.epam.mjc;

import java.util.concurrent.Executors;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(String id) {
        super("Could not find student with ID "+id);
    }
}
