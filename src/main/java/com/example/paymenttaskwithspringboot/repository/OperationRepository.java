package com.example.paymenttaskwithspringboot.repository;

import com.example.paymenttaskwithspringboot.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation,Long> {
}
