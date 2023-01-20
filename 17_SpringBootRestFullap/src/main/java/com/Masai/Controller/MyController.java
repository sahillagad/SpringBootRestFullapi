package com.Masai.Controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Bean.Product;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	
	List<Product> products=new ArrayList<>();
	
	 
	@PostConstruct
	public void initMethod() {
		
		products.add(new Product(1, "Pen", 12.4, "Mumbai"));
		products.add(new Product(2, "Laptop",45000.00, "Mumbai"));
		products.add(new Product(3, "Pancil",5.00, "Mumbai"));
		products.add(new Product(4, "Lux", 250.00, "Mumbai"));
		products.add(new Product(5, "Mouse", 499.99, "Mumbai"));
	}
	
	
//	http://localhost:8888/Products
	@GetMapping("/Products")
	public List<Product> getAllproducts(){
		
		if(products==null) {
			
			throw new IllegalArgumentException("Student DataBase Is Empty");
		   			
		}
	
		return products;
	}
	
//	http://localhost:8888/Products/1
	@GetMapping("/Products/{id}")
	public Product getProductById(@PathVariable("id") Integer productId) {
		
	Product product1=null;	
		for(Product product:products) {
			
			if(product.getProductId()==productId) {
				
				 product1=product;
			}
			
		}
		if(product1==null) {
			
			throw new IllegalArgumentException("Student is not Found In DataBase");
	
			
		}
	
		return product1;
	}
	
	
	
	
//	http://localhost:8888/Products
	@PostMapping("/Products")
	public String  addProduct(@RequestBody Product product) {
		
      products.add(product);
	
     
       return product.getProductId()+" Product Is Add Successfully ";
	}
	
	
	
	
	
//	http://localhost:8888/Products/1/400
	@PutMapping("/Products/{id}/{price}")
	public String  updatePrice(@PathVariable("id") Integer productId,@PathVariable("price") Double price) {
	
		
	for(Product product:products) {
			
			if(product.getProductId()==productId) {
				
				product.setProductPrice(product.getProductPrice()+price);
				 
				return  product.getProductName()+" Product Price Added "+product.getProductPrice();
			}
			
		}
	return null;
     
	}
	
	
//	http://localhost:8888/Product
	@PostMapping("/Product")
	public List<Product>  AddProductHandler(@RequestBody Product product) {
		
      products.add(product);
	
     return products;
      
	}
	
	
	
	
	
	
	
	
	
	
	
}
