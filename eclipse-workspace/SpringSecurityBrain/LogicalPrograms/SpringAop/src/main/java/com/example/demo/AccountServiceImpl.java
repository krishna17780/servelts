package com.example.demo;


import com.example.demo.pojo.Account;

public class AccountServiceImpl {
	
	
	public void updateaccountBalance(Account account, Long amount) {
		 System.out.println("Account No: "+account.getAccountNumber()+", Amount:" +amount);
	}

}
