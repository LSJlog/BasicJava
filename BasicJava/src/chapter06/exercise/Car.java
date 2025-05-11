package chapter06.exercise;

public class Car {
	// 필드
	private double speed;
	private String color;
	private final static double MAX_SPEED = 200;
	
	// 생성자
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	// 메소드
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	public boolean speedUp(double speed) {
		if (speed < 0 || speed > MAX_SPEED) {
			return false;			
		} else {
			this.speed += speed;
			return true;
		}
	}

	
}
