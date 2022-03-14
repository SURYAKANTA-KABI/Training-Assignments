package com.cg.testprojects;

import java.util.ArrayList;

import com.cg.projects.GroceryProduct;
import com.cg.projects.Beverage;
import com.cg.projects.DairyProduct;
import com.cg.projects.Fat;
import com.cg.projects.SugarLevel;

public class Supermarket {

	public static void main(String[] args) {
		ArrayList <GroceryProduct> cart = new ArrayList <GroceryProduct>();
		GroceryProduct toast = new GroceryProduct("Toast",2.5,10);
		cart.add(toast);
		
		Beverage coke = new Beverage("Coke",1.5,0, SugarLevel.ZERO);
		cart.add(coke);
		
		DairyProduct milk = new DairyProduct("Milk",4,0, Fat.FULLCREAM);
		cart.add(milk);
		
		double total = 0;
		
		for(int i=0;i<cart.size(); i++) {
			total+= cart.get(i).getActualPrice();
		}
		System.out.print("The total cost = " +total);
	}

}
