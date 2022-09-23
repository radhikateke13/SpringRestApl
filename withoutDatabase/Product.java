package com.example.demo.withoutDatabase;

public class Product {
	
	int id;
	String Productname;
	int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id, String productname, int price) {
		super();
		this.id = id;
		Productname = productname;
		this.price = price;
	}
	
}
