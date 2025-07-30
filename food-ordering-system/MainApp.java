package com.food.ordering.system;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	@SuppressWarnings("unchecked")
public static void main(String[] args) {
  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
  Customer customer = context.getBean(Customer.class);
  List<Restaurant> restaurants = context.getBean("restaurants", List.class);
  FoodOrderService service = context.getBean(FoodOrderService.class);

  service.orderFood(customer, restaurants);

  context.close();
}
}
