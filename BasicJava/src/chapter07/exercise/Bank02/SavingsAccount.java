package chapter07.exercise.Bank02;

public class SavingsAccount extends BankAccount{
	// 필드
	private double interestRate;	// 이자율
	
	// 생성자
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	// 메소드
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
	public String toString() {
		return String.format("잔액: %s", balance);
	}
}
