package chapter07.exercise.Bank02;

public class BankAccount {
	// 필드
	protected int balance;	// 잔액
	
	// 생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	// 메소드
	
	public int getBalance() {	// 현재 계좌의 잔액
		return balance;
	}
	
	public int deposit(int amount) {	// 입금
		balance += amount;
		return balance;
	}
	
	public boolean withdraw(int amount) {	// 출금
		balance -= amount;
		if (balance < 0) {
			balance += amount;
			return false;
		} else {
			return true;
		}	
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {	// 송금
		if (withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false; 
		}
	}
}
