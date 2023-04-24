package com.example.paymenttaskwithspringboot.controller;

import com.example.paymenttaskwithspringboot.entity.Operation;
import com.example.paymenttaskwithspringboot.service.OperationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operation")
public class OperationController {
    private final OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }
    @PostMapping("/createOperation")
    public Operation createOperation(@RequestBody Operation operation){

        return operationService.createOperation(operation);
    }


}
