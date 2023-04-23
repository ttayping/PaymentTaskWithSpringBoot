package com.example.paymenttaskwithspringboot.service;

import com.example.paymenttaskwithspringboot.repository.OperationRepository;
import org.springframework.stereotype.Service;

@Service
public class OperationService {
    private final OperationRepository operationRepository;

    public OperationService(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }
}
