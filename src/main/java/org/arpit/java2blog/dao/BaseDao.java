package org.arpit.java2blog.dao;

import java.util.List;



public interface BaseDao {
	public <po> List<po> getByList() ;

	public<Po> Po getById(int id ,Class<Po> aClass);

	public<Po> void updateObject(Po Po) ;

	public <Po>void deleteById(int id) ;

	<Po> Po addObject(Po po);

}
