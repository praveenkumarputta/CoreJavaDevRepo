package com.praveenp.enty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BANK_TABLE")
public class Bank {
	
//	public static final String BOOTSTRAP_SERVERS_CONFIG = null;
//	public static final String KEY_SERIALIZER_CLASS_CONFIG = null;
//	public static final String VALUE_SERIALIZER_CLASS_CONFIG = null;
	@Id
	@GeneratedValue
	private int id;
	private String bankName;
	private String branchName;
	private Long ifscCode;
	private double amount;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName(String branchName) {
	    return branchName;
	
	}
	public void setBranch(String branch) {
		this.branchName = branch;
	}

	public Long getIfscCode() {
		return ifscCode;
	}

	public void setIfstCode(Long ifscCode) {
		this.ifscCode = ifscCode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/*public Bank(int id, String bankName, String branch, Long ifstCode, double amount) {
	super();
	this.id = id;
	this.bankName = bankName;
	this.branch = branch;
	this.ifstCode = ifstCode;
	this.amount = amount;
}

public Bank() {

}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankName=" + bankName + ", branch=" + branch + ", ifstCode=" + ifstCode
				+ ", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + id;
		result = prime * result + ((ifstCode == null) ? 0 : ifstCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (id != other.id)
			return false;
		if (ifstCode == null) {
			if (other.ifstCode != null)
				return false;
		} else if (!ifstCode.equals(other.ifstCode))
			return false;
		return true;
	}*/

}
