package chapter06;

public class Car {
	String company = "현대자동차";
	String model = "그렌저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	Car() {
		
	}
	
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
