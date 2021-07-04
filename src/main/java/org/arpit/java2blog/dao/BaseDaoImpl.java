package org.arpit.java2blog.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.arpit.java2blog.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl implements BaseDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	
	@Override
	public <Po> List<Po> getByList() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Po>  customerList = session.createQuery("from Customer").list();
		return customerList;
	}

	@Override
	public<Po> Po getById(int id ,Class<Po> aClass) {		
		Session session = this.sessionFactory.getCurrentSession();
		Po po =  session.get(aClass, id);
	
		return po;

	}

	@Override
	public  void updateObject(Object po) {

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <Po> Po addObject(Po po) {
		// TODO Auto-generated method stub
		return null;
	}


}
