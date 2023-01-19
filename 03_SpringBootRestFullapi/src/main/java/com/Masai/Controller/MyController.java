package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.bean.Product;



@RestController
public class MyController {


	@RequestMapping("/product")
    public Product getProduct() {
			return new Product(1,"LUX",673);
	}
	
	
	@RequestMapping("/products")
    public List<Product> getProducts() {
		List<Product> list=new ArrayList<>();
		
		list.add(new Product(1,"LUX",673));
		list.add(new Product(2,"Pen",33));
		list.add(new Product(3,"Laptop",60973));
		list.add(new Product(4,"Mouse",500));
		list.add(new Product(5,"Light",50));
		
		return list;
	}
	
	@RequestMapping(value =  "/getproduct",method =RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE )
	  public Product getProduct1() {
		return new Product(1,"LUX",673);
    }

	@RequestMapping(value =  "/getproduct1",method =RequestMethod.GET )
	  public Product getProduct2() {
		return new Product(1,"LUX",673);
  }
	
	
	@GetMapping(value =  "/getproduct2" ,produces = MediaType.APPLICATION_JSON_VALUE )
	  public Product getProduct3() {
		return new Product(1,"LUX",673);
     }
	
	
	
	@GetMapping(value =  "/getproduct3" )
	  public Product getProduct4() {
		return new Product(1,"LUX",673);
     }
	
	
	
	
	
}
