package com.example.budgeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.budgeting.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
