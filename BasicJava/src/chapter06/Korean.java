package chapter06;

public class Korean {
//	필드
	String nation = "대한민국";
	String name;
	String ssn;
//	생성자
//	Design pattern : Telescoping Constructor Pattern
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn ;
	}
}
