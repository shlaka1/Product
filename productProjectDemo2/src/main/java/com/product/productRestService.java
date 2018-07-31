package com.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productRestService {

	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product>  listProducts()
	{
		return productRepository.findAll();
		
	}
	
	/*@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Product  getProduct(@PathVariable (name="id")String id)
	{
		return  productRepository.findOne(id);

	}
	*/
	@RequestMapping(value="/products",method=RequestMethod.POST)
	public Product  save(@RequestBody Product p)
	{
		return  productRepository.save(p);
	
	}
	
	@RequestMapping(value="/updateP",method=RequestMethod.PUT)
	public Product  update(@RequestBody Product p)
	{	
		
		return  productRepository.save(p);
	
	}
	
	@DeleteMapping("/delete/{id}")
	public void  delete(@PathVariable (name="id")String id)
	{	
		
		  productRepository.deleteById(id);
		  
	
	}
	
	
}
