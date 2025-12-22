package datics.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datics.entity.Customer;
import datics.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	public String saveCustomer(Customer customer) {
		customerRepo.save(customer);
		return "Customer was saved!";
	}

	public void saveCustomerData() throws IOException {
		String filepath = "C:\\Users\\vijay\\Desktop\\SpringBoot_Project\\postgress_Project\\src\\main\\resources\\data.txt";
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				Customer cus = new Customer();
				cus.setCustomerId(Integer.parseInt(data[0]));
				cus.setCustomerName(data[1]);
				cus.setCustomerDescription(data[2]);
				cus.setCustomerAge(Integer.parseInt(data[3]));
				customerRepo.save(cus);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

	public void killDB() {
		boolean status = true;
		long id =1;
		while(status!= false) {
			Customer cus = new Customer();
			cus.setCustomerId(++id);
			cus.setCustomerName("vijay");
			cus.setCustomerDescription("He is a good person");
			cus.setCustomerAge(34);
			customerRepo.save(cus);
		}
		
	}
	

}
