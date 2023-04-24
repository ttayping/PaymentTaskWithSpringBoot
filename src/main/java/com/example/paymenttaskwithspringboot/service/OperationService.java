package com.example.paymenttaskwithspringboot.service;

import com.example.paymenttaskwithspringboot.entity.Operation;
import com.example.paymenttaskwithspringboot.repository.OperationRepository;
import org.springframework.stereotype.Service;

@Service
public class OperationService {
    private final OperationRepository operationRepository;
    private final CardService cardService;
    private final MerchantService merchantService;


    public OperationService(OperationRepository operationRepository, CardService cardService,
                            MerchantService merchantService) {
        this.operationRepository = operationRepository;
        this.cardService = cardService;
        this.merchantService = merchantService;
    }
    public String hidePanNumbers(String panNumber){
        return "*".repeat(12) + panNumber.substring(12);
    }
    public Operation createOperation(Operation operation){
        return operationRepository.save(operation);
    }
}
