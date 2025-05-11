package chapter06;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바","012345-1234567");
		System.out.println(k1);
//		k1.name = "박자바";
//		k1.ssn = "012345-1234567";
		
		Korean k2 = new Korean("김자바","930123-0192938");
		System.out.println(k2);
//		k2.name = "김자바";
//		k2.ssn = "930123-0192938";
		
		Korean k3 = new Korean("최자바","112233-4455667");
		System.out.println(k3);
//		k3.name = "최자바";
//		k3.ssn = "112233-4455667";
	}
}
