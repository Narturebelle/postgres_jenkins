package datics.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import datics.entity.Customer;
import datics.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	//Blalala
	@PostMapping("/save")
	public String saveCustomer(Customer customer) {
		customerService.saveCustomer(customer);
		return "Customer was saved!";
	}
	
	@GetMapping("/save/data")
	public String saveCustomerData() throws IOException {
		customerService.saveCustomerData();
		return "Customer was saved!";
	}
	
	@GetMapping("/killDB")
	public void  killDB() {
		customerService.killDB();
	}
	
}
