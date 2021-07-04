package org.arpit.java2blog.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl implements BaseDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public<Po> List<Po> getByList() {
		
		return null;
	}

	@Override
	public<Po> Po getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  void updateObject(Object po) {
		// TODO Auto-generated method stub
		
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
