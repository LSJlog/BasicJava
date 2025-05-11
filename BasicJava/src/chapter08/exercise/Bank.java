package chapter08.exercise;

public class Bank {
	// 필드
	private Customer[] customers;
	private int numberOfCustomers;
	
	// 생성자
	// 배열 크기 초기화
	public Bank() {
		customers = new Customer[10];	
	}
	
	// 메소드
	// 인자로 받은 customer를 customers 배열에 할당
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
		return ;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
}