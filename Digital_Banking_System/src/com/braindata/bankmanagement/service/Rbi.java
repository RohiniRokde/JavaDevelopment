package com.braindata.bankmanagement.service;

public interface Rbi {
	
	public void createAccount();
    public void displayAllDetails();
    public void depositMoney(double amount);
    public void withdrawal(double amount);
    public void balanceCheck();
}


