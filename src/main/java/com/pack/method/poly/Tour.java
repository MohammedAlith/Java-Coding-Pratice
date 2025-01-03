package com.pack.method.poly;

public class Tour {
String name, place, country;
int age; long price;

public void details(String name, String place, String country) {
	this.name=name;
	this.place=place;
	this.country=country;
	}

public void details(int age, long price) {
	this.age=age;
	this.price=price;
	}
  
public void display() {
	System.out.println(name);
	System.out.println(place);
	System.out.println(country);
	System.out.println(age);
	System.out.println(price);
	
}
}
