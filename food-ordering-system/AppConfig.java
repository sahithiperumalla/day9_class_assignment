package com.food.ordering.system;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//AppConfig.java
//AppConfig.java
@Configuration
public class AppConfig {
 @Bean
 public Customer customer() {
     return new Customer("Sahithi", "sahithi@example.com", "Italian");
 }
 @Bean
 public Restaurant restaurant1() {
     return new Restaurant("Pasta Place", "Main St", Arrays.asList("Italian", "French"));
 }
 @Bean
 public Restaurant restaurant2() {
     return new Restaurant("Curry House", "Market Rd", Arrays.asList("Indian", "Thai"));
 }
 @Bean
 public List<Restaurant> restaurants() {
     return Arrays.asList(restaurant1(), restaurant2());
 }
 @Bean
 public FoodOrderService foodOrderService() {
     return new FoodOrderService();
 }
}
