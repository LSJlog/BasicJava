package chapter06.exercise;

public class NewCar {
	// 필드
	private double speed;
	private String color;
	private final static double MAX_SPEED = 200;
	
	// 생성자
	NewCar(){
		
	}
	
	NewCar(String color){
		this.color = color;
	}

	// 메소드
	public double getSpeed() {
		return mileToKilo(speed);
	}
	
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public static double getMaxSpeed() {
		return mileToKilo(MAX_SPEED);
	}
	// 현재 속도에서 한계 속도...
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if (speed + this.speed >= 0 && speed + this.speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return false;
		}
	}
		
	// 단위 변환 
	static private double killoToMile(double distance) {
		return distance / 1.6;
	}
	
	static private double mileToKilo(double distance) {
		return distance * 1.6;
	}
	
	public String toString() {
		return String.format("%d", speed);
	}
}
