package com.praveenp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveenp.enty.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

	Bank findById(int id);

	Bank findByBankName(String name);

	Bank findByBranchName(String branchName);

	Bank findByIfscCode(Long ifscCode);

	Bank findByAmount(Double amount);

}
