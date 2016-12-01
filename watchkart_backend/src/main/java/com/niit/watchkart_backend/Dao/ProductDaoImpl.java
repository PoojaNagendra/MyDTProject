package com.niit.watchkart_backend.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.watchkart_backend.model.Product;







public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private Product product;
	
	@Autowired
	public ProductDaoImpl (SessionFactory sessionFactory)
	{
	 this.sessionFactory = sessionFactory;	
	}
    
	@Transactional
	public void insertORupdate(Product pro)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(pro);
		
	}

	@Transactional
	public void delProduct(String pid)
	{
		product.setPid(pid);
		sessionFactory.getCurrentSession().delete(product);
		
	}

	
	@Transactional
	public List<Product> getAll() {
		@SuppressWarnings("unchecked")
		List<Product> list = (List<Product>) sessionFactory.getCurrentSession()
				.createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}
	

	public Product getProduct(String pid, String pname, String pprice, String pcategoryid, String pstatus,
			String poffer, String psupplierid) {
		// TODO Auto-generated method stub
		return null;
	}

}
