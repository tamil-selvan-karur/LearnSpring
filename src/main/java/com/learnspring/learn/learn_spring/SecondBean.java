package com.learnspring.learn.learn_spring;

public class SecondBean {
	private String bank;
	private int balance;

	

	public SecondBean(int balance) {
		this.balance = balance;
	}
	
	public SecondBean(String bank) {
		this.bank = bank;
	}

	public SecondBean(String bank, int balance) {
		this.bank = bank;
		this.balance = balance;
	}
//	public void setBalance(String balance) {
//		this.balance = Integer.parseInt(balance);
//	}
//
//	public void setBank(String bank) {
//		this.bank = bank;
//	}

	public void printBankData() {
		System.out.println("Your Bank is " + bank + " and your balance is " + balance);
	}

}
