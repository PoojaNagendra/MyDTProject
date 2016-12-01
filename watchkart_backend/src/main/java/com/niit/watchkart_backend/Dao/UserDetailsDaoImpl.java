package com.niit.watchkart_backend.Dao;

import java.util.List;

import org.hibernate.Criteria;
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
	public void delUserDetails(String uid) {
		userdetails.setUid(uid);
		sessionFactory.getCurrentSession().delete(userdetails);
		
	}

	
	@Transactional
	public List<UserDetails> getAll() {
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) sessionFactory.getCurrentSession()
				.createCriteria(UserDetails.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}




	public UserDetails getuserdetails(String uid, String pwd, String name, String address, String phoneno,
			String remarks, String houseno, String street, String city, String pincode, String state, String country) {
		// TODO Auto-generated method stub
		return null;
	}




	}

	