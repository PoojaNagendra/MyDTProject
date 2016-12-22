package com.niit.watchkart_backend.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.watchkart_backend.model.Cart;
import com.niit.watchkart_backend.model.Users;

public class CartDaoImpl implements CartDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private Cart cart;
	
	@Autowired
	private CartDao cartDao;
	
	public CartDaoImpl (SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	
	
   @Transactional
	public void insertORupdate(Cart cart)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}
    @Transactional
	public void delCart(int cid) {
		cart.setCid(cid);
		sessionFactory.getCurrentSession().delete(cart);
		
	}

	@Transactional
	public List<Cart> getAll() {
		@SuppressWarnings("unchecked")
		List<Cart> list = (List<Cart>) sessionFactory.getCurrentSession()
				.createCriteria(Cart.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}


	public Cart getcart(int cid) {
		// TODO Auto-generated method stub
		return null;
	}


    @Transactional
	public List<Cart> getAllbyUser(String usr) {
		String hql = "from Cart where Username='" + usr+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Cart> listCart = (List<Cart>) query.list();
		
		if (listCart != null && !listCart.isEmpty()) {
			return listCart;
		}
		return null;
		
	}

}
