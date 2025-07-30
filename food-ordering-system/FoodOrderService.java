package com.food.ordering.system;

import java.util.List;

//FoodOrderService.java
public class FoodOrderService {
	public void orderFood(Customer customer, List<Restaurant> restaurants) {
	    System.out.println("Order request from customer: " + customer.getName() + ", preferred cuisine: " + customer.getPreferredCuisine());
	    for (Restaurant restaurant : restaurants) {
	        if (restaurant.getCuisines().contains(customer.getPreferredCuisine())) {
	            System.out.println("Order placed at: " + restaurant.getName() + ", located at " + restaurant.getLocation());
	            return;
	        }
	    }
	    System.out.println("Sorry, no restaurants available for your preferred cuisine.");
	}

 
}
