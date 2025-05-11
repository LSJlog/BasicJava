package chapter08.exercise;

public class ScienceFiction extends Book {
	// 생성자
	public ScienceFiction(String title,String author) {
		super(title, author);
	}
	
	// 메소드
	@Override
	public int getLateFee(int lateDays) {
		return 600*lateDays;
	}

}
