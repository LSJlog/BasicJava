package chapter08.exercise;

public class poet extends Book {
	// 생성자
	public poet(String title,String author) {
		super(title, author);
	}
	
	// 메소드
	@Override
	public int getLateFee(int lateDays) {
		return 200*lateDays;
	}

}
