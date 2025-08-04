package com.example.budgeting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.budgeting.entity.Transaction;
import com.example.budgeting.repository.TransactionRepository;

import jakarta.persistence.EntityManager;

@Service
public class TransactionService {
	
	private TransactionRepository transactionRepo;
	
	@Autowired
	public TransactionService(TransactionRepository transactionRepository) {
		this.transactionRepo = transactionRepository;
	};
	
	public Transaction save(Transaction trans) {
		return transactionRepo.save(trans);
	}
	
	public List<Transaction> getAll() {
		List<Transaction> res = transactionRepo.findAll();
		System.out.println("findall res:: "+res.toString());
		return res;
	}
		
}


//@Service
//public class EmployeeService {
//    @Autowired
//    private EmployeeRepository repo;
//
//    public Employee save(Employee emp) {
//        return repo.save(emp);
//    }
//
//    public List<Employee> getAll() {
//        return repo.findAll();
//    }
//}
