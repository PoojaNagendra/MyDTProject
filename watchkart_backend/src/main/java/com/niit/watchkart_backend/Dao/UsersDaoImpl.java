package com.niit.watchkart_backend.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.watchkart_backend.model.Users;



public class UsersDaoImpl implements UsersDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private Users users ;
	
	@Autowired
	private UsersDao usersDao;
	
	public UsersDaoImpl (SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	public Users getUsers(String uid, String pwd, String role) {
		// TODO Auto-generated method stub
		return null;
	}
  @Transactional
	public void insertORupdate(Users usr) 
	{
	
		sessionFactory.getCurrentSession().saveOrUpdate(usr);
	}

	@Transactional
	public void delUsers(String uid) {
		users.setUid(uid);
		sessionFactory.getCurrentSession().delete(users);
		
	}

	@Transactional
	public List<Users> getAll() {
		@SuppressWarnings("unchecked")
		List<Users> list = (List<Users>) sessionFactory.getCurrentSession()
				.createCriteria(Users.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}
}