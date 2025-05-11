package chapter07.exercise;

public class Student extends Human {
	// 필드
	private String major;
	
	// 생성자
	public Student(String name, int age, String major) {
//		super.name = name;
//		super.age = age;
		super(name, age);
		this.major = major;
	}
	
	// 메소드
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", 전공: " + major;
	}
}
