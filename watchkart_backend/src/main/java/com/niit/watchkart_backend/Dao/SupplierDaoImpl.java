package com.niit.watchkart_backend.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.watchkart_backend.model.Supplier;


public class SupplierDaoImpl implements SupplierDao {
	
   @Autowired
   private SessionFactory sessionFactory;
   
   @Autowired
   private Supplier supplier;
   
   @Autowired
   private SupplierDao supplierDao;
    public SupplierDaoImpl (SessionFactory sessionFactory)
    {
    	this.sessionFactory = sessionFactory;
    }
   
	public Supplier getSupplier(String sid, String sname, String saddress) {
		
		return null;
	}
  @Transactional
	public void insertORupdate(Supplier sup) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(sup);
		
	}
    @Transactional
	public void delSupplier(String sid) 
	{	
		supplier.setSid(sid);
		sessionFactory.getCurrentSession().delete(supplier);
	}
	
	
	
	@Transactional
	public List<Supplier> getAll() {
		@SuppressWarnings("unchecked")
		List<Supplier> list = (List<Supplier>) sessionFactory.getCurrentSession()
				.createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}

}
