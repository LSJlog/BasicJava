package chapter06;

public class BoardExample {
	public static void main(String[] args) {
		Board board1 = new Board(null, null);
		Board board2 = new Board(null, null, null);
		Board board3 = new Board(null, null, null, null);
		Board board4 = new Board(null, null, null, null, 0);
		
		System.out.println(board1);
		System.out.println(board2);
		System.out.println(board3);
		System.out.println(board4);
	}
}
