package org.arpit.java2blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.dao.CustomerDao;
import org.arpit.java2blog.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Transactional
	public Customer getCustomer(int id) {
		Customer temp = customerDao.getCustomer(id);
		
	//	System.out.println(temp.getCustomerName()+ " "+temp.getEmail() + "...............");
		return temp;
	}

	@Transactional
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Transactional
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
	}

	@Transactional
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}
	
}
