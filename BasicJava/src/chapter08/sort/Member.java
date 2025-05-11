package chapter08.sort;

public class Member implements Comparable<Member> {
	private String name;
	private int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);		
//		if (age > o.age) {
//			return 1;
//		} else if (age == o.age) {
//			return 0;
//		} else {
//			return -1;
//		}
	}
}
