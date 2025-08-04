package com.example.budgeting.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer amount;
	private String category;
	private String remarks;
	private String doneAt;
	@CreationTimestamp
	private LocalDateTime addAt;
	
	public String toString() {
		return "{id:: "+id+"amount:: " +amount+ "category:: "+category+"remarks:: " + remarks + "doneAt:: " + doneAt + "addAt:: "+addAt+ "}";
	}
	
	
	public Transaction(Long id, Integer amount, String category, String remarks, String doneAt) {
		this.id = id;
		this.amount = amount;
		this.category = category;
		this.remarks = remarks;
		this.doneAt = doneAt;
	}
	
	public Transaction() {
		
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setDoneAt(String doneAt) {
		this.doneAt = doneAt;
	}
	
	public String getDoneAt() {
		return doneAt;
	}
	
}
