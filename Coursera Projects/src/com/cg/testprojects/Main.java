package com.cg.testprojects;

import com.cg.projects.Car;

public class Main {

	public static void main(String[] args) {
		Car car1=new Car();
		//car1.setMake("Ford");
		System.out.println("Count of Objects: " + (Car.count));
		
		Car car2=new Car("Chevy","Corvette","red",2020,"23050.99");
		//car2.setMake("Chevy");
		System.out.println("Car1 Make: " + car1.getMake());
		
		/*System.out.println("Car2 Make: " +car2.getMake());
		System.out.println("Car2 Model: " +car2.getModel());
		System.out.println("Car2 color: " +car2.getColor());
		System.out.println("Car2 Price: " +car2.getPrice());*/
		System.out.println("Count of Objects: " + (Car.count));
		System.out.println("Car2:" + car2);

	}

}
