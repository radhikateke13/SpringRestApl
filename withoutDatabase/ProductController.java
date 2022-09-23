package com.example.demo.withoutDatabase;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	 
	@GetMapping("/Productdetils")
	public List<Product> getProducts()
	{
		return ProductService.getProductDetails();
	}
	@GetMapping("/Productdetailsbyid/{id}")
	public Product getProductById(@PathVariable int id) {
		 return ProductService.getProductById(id);
	}
	
	//localhost:8080/Productdetailsbyid?Pid=1
	//use This URL in postman to run The code
	@GetMapping("/Productdetailsbyid")
	public Product getProductById1(@RequestParam("Pid")int id)
	{
		 return ProductService.getProductById(id);
	}
	
	//localhost:8080/addProduct
	@PostMapping ("/addProduct")
	public Product getProductById2(@RequestBody Product p)
	{
		return ProductService.addProduct(p);
	}
	
	@DeleteMapping("/delete/{id}")
	
		public Product
		removewithId(@PathVariable int id)
		{
			return
					ProductService.removeProduct(id);
		}
	
}
