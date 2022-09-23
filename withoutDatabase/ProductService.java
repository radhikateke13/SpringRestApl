package com.example.demo.withoutDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	
	private static Map<Integer, Product> ps=new HashMap<>();
	private static int index=5;
	static {
		Product p1 = new Product(1,"facewash",50);
		Product p2= new Product(2,"soap",20);
		Product p3 = new Product(3,"Pen",60);
		ps.put(3, p3);
		ps.put(1, p1);
		ps.put(2, p2);
	}
	
	public static List<Product> getProductDetails(){
		return new ArrayList<>(ps.values());

	}
	public static Product getProductById(int id) {
		return ps.get(id);
	}
	public static Product addProduct(Product p) {
		// TODO Auto-generated method stub
		index=5;
		p.setId(5);
		ps.put(5,p);
		return p;
	}
	public static Product removeProduct(int id) {
		return ps.remove(id);
	}
	
	public static Product deleteProduct(int id)
	{
		return ps.remove(id);
	}
} 
