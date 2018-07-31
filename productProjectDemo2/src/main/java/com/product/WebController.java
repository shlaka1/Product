package com.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@Autowired
	private userRepository userRepository;
	@Autowired
	private ProductRepository productRepository;


	@GetMapping("/")
    public String homepage(Model model){
		userRepository.save(new user("user","pwd"));
        model.addAttribute("user", new user());
        return "login";
    }

    @PostMapping("/")
    public String greetingSubmit(@ModelAttribute user user,Model model) {
    	if(user.getUsername().equals("user") && user.getPassword().equals("pwd"))
    	{
    		return "home";
    	}
    	else {
    	model.addAttribute("res","username or password is incorrect");
        return "login";
    	}
    }
    
	@GetMapping("/create")
    public String create(Model model){
		model.addAttribute("p", new Product());

        return "add";
    }

    
    @PostMapping("/add")
	public String  save(@ModelAttribute Product p,Model model)
	{
	 productRepository.save(p);
	  return "home";
	
	}
    
    @GetMapping("/delete")
	public String  delete()
	{
	
	  return "delete";
	
	}
    
    @GetMapping("/home")
	public String  home()
	{
	
	  return "home";
	
	}
    
    @GetMapping("/up")
	public String  up()
	{
	
	  return "up";
	
	}
    

    

    @RequestMapping(value="/update",method=RequestMethod.POST)
	public String  getProductee(@RequestParam("id")String id,Model model)
	{	
    	
      	Optional<Product> p= productRepository.findById(id);
        
    	model.addAttribute("p", p.get());
    	//model.addAttribute("p", new Product());

	     return "update";
		  
	
	}
    
	@RequestMapping(value="/updatePP",method=RequestMethod.POST)
	public String  update(@ModelAttribute Product p)
	{	
		
	  productRepository.save(p);
	  return "home";
	
	}
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
}