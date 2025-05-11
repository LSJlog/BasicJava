package chapter08.exercise;

import java.util.Objects;

public abstract class Book {
	// 필드
	private int number;	// 관리번호
	private String title;	// 책의 제목
	private String author; 	// 책의 저자
	private static int countOfBooks;	// 만들어진 Book 객체 개수, 선언과 동시에 0으로 초기화
	
	// 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
		number = ++countOfBooks;
	}

	// 메소드
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract int getLateFee(int lateDays);
	public boolean equals(Object obj) {	// Object obj = new Book("책1", "작가1")
		// 1. 주소가 같으면 같은 객체
		if (this == obj) {
			return true;
		}
		// 2. title과 author가 같으면 같은 객체
		if (!(obj instanceof Book)) {
			return false;
		}
		Book book = (Book) obj;
		return title.equals(book.title) && author.equals(book.author);
//		return Object.equals(title, book.title) && Object.equals(author, book.author);
		
//		if(this.title.equals(((Book)o).title) && this.author.equals(((Book) o).author)) {
//			return true;
//		}
//		return false;
	}
	public int hashCode() {
		return Objects.hash(title,author);
	}
	public String toString() {
		return String.format("관리번호: %d번, 제목: %s, 작가: %s(일주일 연체료: %d원) ", number, title, author, getLateFee(7));
	}
}
