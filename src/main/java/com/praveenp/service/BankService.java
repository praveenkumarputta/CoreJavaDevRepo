package com.praveenp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveenp.enty.Bank;
import com.praveenp.repo.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository repository;

	public Bank saveBank(Bank bank) {
		return repository.save(bank);
	}

	public List<Bank> saveBank(List<Bank> bank) {
		return repository.saveAll(bank);
	}

	public List<Bank> getMapping() {
		return repository.findAll();
	}

	public Bank getBankById(int id) {
		return repository.findById(id);
	}

	public Bank getBankBybankName(String name) {
		return repository.findByBankName(name);

	}

	public Bank getBranchName(String name) {
		return repository.findByBranchName(name);

	}

	public Bank getBankBybankifscCode(Long name) {
		return repository.findByIfscCode(name);

	}

	public Bank getBankByamount(Double amount) {
		return repository.findByAmount(amount);

	}

	public Bank updateBank(Bank bank) {
		Bank existingBankData = repository.findById(bank.getId()); 
		existingBankData.setBankName(bank.getBankName());
		existingBankData.setBranchName(bank.getBranchName());
		existingBankData.setIfscCode(bank.getIfscCode());
		existingBankData.setAmount(bank.getAmount());
		return repository.save(existingBankData);
	}
	public String deleteBank(int id) {
		repository.deleteById(id);
		return "Bank Details Removed based on Id..!!!!";

	}

}
