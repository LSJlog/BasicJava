package chapter07.ex01;

// 자식 객체 이용
public class StudentExample {
	 public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo" + student.studentNo);
		
	}
}
