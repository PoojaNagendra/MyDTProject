package com.niit.watchkart_backend.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.niit.watchkart_backend.model.UserDetails;


public class UserDetailsDaoImpl implements UserDetailsDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private UserDetails userdetails;
	
	@Autowired
	private UserDetailsDao userdetailsDao;
	 public UserDetailsDaoImpl (SessionFactory sessionFactory)
    {
    	this.sessionFactory = sessionFactory;
    }
   
	
	
	
	@Transactional
	public void insertORupdate(UserDetails userdetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(userdetails);
		
	}
  

	
	@Transactional
	public List<UserDetails> getAll() {
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) sessionFactory.getCurrentSession()
				.createCriteria(UserDetails.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}



    @Transactional
	public UserDetails getuserdetails(int uid) {

    	String hql = "from Supplier where uid='" + uid+"'";
    		Query query = sessionFactory.getCurrentSession().createQuery(hql);
    		
    		@SuppressWarnings("unchecked")
    		List<UserDetails> listUserdetails = (List<UserDetails>) query.list();
    		
    		if (listUserdetails != null && !listUserdetails.isEmpty()) {
    			return listUserdetails.get(0);
    		}
    		return null;
		
	}



    @Transactional
	public void delUserDetails(int uid) {
		userdetails.setUid(uid);
		sessionFactory.getCurrentSession().delete(userdetails);
		
	}











	}

	