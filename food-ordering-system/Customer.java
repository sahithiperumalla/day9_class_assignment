package com.food.ordering.system;

public class Customer {
    private String name;
    private String contactInfo;
    private String preferredCuisine;

    public Customer(String name, String contactInfo, String preferredCuisine) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.preferredCuisine = preferredCuisine;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getPreferredCuisine() {
        return preferredCuisine;
    }
}
