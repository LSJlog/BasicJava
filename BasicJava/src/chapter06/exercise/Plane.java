package chapter06.exercise;

public class Plane {
	// 필드
	String manufacturer;
	String model;
	int maxNumberOfPassengers;
	static int numberOfPlanes;
	
	// 생성자
	public Plane(){
		numberOfPlanes++;
	}
	
	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++;
	}

	// 메소드
	public String getManufacture() {
		return manufacturer;
	}
	
	public void setManufacture(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers < 0) {
			this.maxNumberOfPassengers = 0;
			return;
		}
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}	
}
