package chapter06.exercise;

public class Circle {
	// 필드
	private double radius;
	private double x;
	private double y;
	static final double PI = 3.141592;
	// 생성자
	
	// 메소드
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius < 0) {
			this.radius = 0;
			return;
		}
		this.radius = radius;
	}

	public double getArea() {
		double area = radius * radius * PI;
		return area;
	}
	
}
