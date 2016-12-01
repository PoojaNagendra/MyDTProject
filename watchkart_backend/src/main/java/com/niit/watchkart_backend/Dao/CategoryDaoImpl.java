package com.niit.watchkart_backend.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.watchkart_backend.model.Category;

public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private Category category;
	
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	public Category getUser(String cid, String cname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Category getCategory(String cid, String cname) {
		return null;
	}
	@Transactional
	public void insertORupdate(Category cat) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(cat);
	}
    @Transactional
	public void delCategory(String cid) 
	{	
		category.setCid(cid);
		sessionFactory.getCurrentSession().delete(category);
	}
	
	@Transactional
	public List<Category> getAll() {
		@SuppressWarnings("unchecked")
		List<Category> list = (List<Category>) sessionFactory.getCurrentSession()
				.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}
}


