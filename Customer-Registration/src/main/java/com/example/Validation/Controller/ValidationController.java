package com.example.Validation.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Validation.entity.Address;
import com.example.Validation.entity.Customer;

import java.util.HashMap;
import java.util.Random;
import java.util.regex.Pattern;

@RestController
@RequestMapping("api/customerdetails")
@CrossOrigin(origins = "http://localhost:4200/")
public class ValidationController {
	
	  private static Random random = new Random();
	 
	  @PostMapping(path = "/Details")
	  public Customer createCustomer(@RequestBody Customer customer) {
			customer.setAccountNumber(random.nextInt());
			return customer;
		}	  
	  
	  @GetMapping(path = "/address")
	  public HashMap<String, String> ValidatedAdress(Address address) {
			int pin = address.getPincode();
			String s = Integer.toString(pin);
			System.out.println("length" +s.length());
			if (s.length()==6) {
				HashMap<String, String> map = new HashMap<>();
			    map.put("key", "address is valid");			   
			    return map;				
			}
			else {
				HashMap<String, String> map = new HashMap<>();
			    map.put("key", "address is not valid");
			   
			    return map;
			}
				
		}
	  
		
	    @GetMapping(path= "/creditcheck/{userName}")
	    public HashMap<String, String> performCreditValidation(@PathVariable String userName){       
	    	String Name =  userName;
			if(Name.length()>4)
			{ 
				HashMap<String, String> map = new HashMap<>();
			    map.put("key", "credit is valid");
			   
			    return map;
			} 
			else
			{
				HashMap<String, String> map = new HashMap<>();
			    map.put("key", "credit is not valid");
			   
			    return map;
	    } 
	    	

	    }
}

