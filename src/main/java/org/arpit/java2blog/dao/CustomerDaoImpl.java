package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Customer;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

@Repository
public class CustomerDaoImpl  implements CustomerDao  {

	@Autowired
	private BaseDao baseDao;



	public List<Customer> getAllCustomers() {
		List<Customer> aList = baseDao.getByList();
		System.out.println("reach....." + aList);
		return baseDao.getByList();
	}

	public Customer getCustomer(int id) {
	return null;
	}

	public Customer addCustomer(Customer customer) {
		return null;
	}

	public void updateCustomer(Customer customer) {
	
	}

	public void deleteCustomer(int id) {
	
	} 
}
