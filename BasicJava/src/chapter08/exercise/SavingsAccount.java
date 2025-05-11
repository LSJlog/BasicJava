package chapter08.exercise;

public class SavingsAccount extends BankAccount{
	// 필드
	private double interestRate;	// 이자율
	
	// 생성자
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	// 메소드
	@Override
	public String getAccountType(){
		return "저축예금";
	}
	
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
	public String toString() {
		return String.format("잔액: %s", balance);
	}
}