package chapter06;

public class Member {
	String name = "이름";
	String id = "아이디";
	String password = "패스워드";
	String firstName;
	int age;
	
	Member(String name, String firstName){
		this.name = name;
		this.firstName = firstName; 
	}
}
