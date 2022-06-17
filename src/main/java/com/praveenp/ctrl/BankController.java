package com.praveenp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.praveenp.enty.Bank;
import com.praveenp.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService service;

//	@Bean
//	public DefaultKafkaProducerFactory<String, Object> Bank() {
//		Map<String, Object> configs = new HashMap<>();
//		configs.put(Bank.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//		configs.put(Bank.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		configs.put(Bank.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//		return new DefaultKafkaProducerFactory<String, Object>(configs);
//	}
//
//	@Bean
//	public Bank bank() {
//		return new Bank();
//	}

	@PostMapping("bank/addBank")
//	(value = "/addBank", consumes = {"application/json" }, produces = {"application/json" })
	public Bank addBank(@RequestBody Bank bank) {
		return service.saveBank(bank);
	}

	@PostMapping("bank/addBanks")
//	(value="/addBanks",consumes = {"application/json" }, produces = {"application/json" })
	public List<Bank> addBank(@RequestBody List<Bank> banks) {
		return service.saveBank(banks);
	}

	@GetMapping("bank/findBankById/{id}")
//			,consumes = {"application/json" }, produces = {"application/json" })
	public Bank BankfindBankById(@PathVariable int id) {
		return service.getBankById(id);
	}

	@GetMapping("bank/findBankByName/{name}")
	// ,consumes = {"application/json" }, produces = {"application/json" })
	public Bank findBybranchName(@PathVariable String branch) {
		return service.getBranchName(branch);
	}

	@PutMapping("bank/update")
	// consumes = {"application/json" }, produces = {"application/json" })
	public Bank updateBank(@RequestBody Bank bank) {
		return service.updateBank(bank);
	}

	@DeleteMapping("bank/deleteById/{id}")
	// ,consumes = {"application/json" }, produces = {"application/json" })
	public String deleteBank(@PathVariable int id) {
		return service.deleteBank(id);
	}

}