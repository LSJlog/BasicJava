package chapter07.ex03;
// 추상 클래스 재정의
public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
