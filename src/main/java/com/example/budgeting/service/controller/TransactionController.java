package com.example.budgeting.service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.budgeting.entity.Transaction;
import com.example.budgeting.service.TransactionService;

@RestController
@RequestMapping("/details")
public class TransactionController {
	
	private TransactionService transService;
	
	public TransactionController(TransactionService transService) {
		this.transService = transService;
	}
	
	@GetMapping
	public List<Transaction> getAll() {
		return transService.getAll();
	}
	
	@PostMapping
	public Transaction create(@RequestBody Transaction trans) {
		System.out.println("transaction received:: "+trans.toString());
		return this.transService.save(trans);
	}
}
