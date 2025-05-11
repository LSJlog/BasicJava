package chapter07.exercise;

public class Human {
	// 필드
	String name; 
	int age;
	
	// 생성자
	public Human(){
		
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
	
}
