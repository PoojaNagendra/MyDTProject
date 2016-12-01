package com.niit.watchkart_backend.Dao;

import java.util.List;

import org.hibernate.Criteria;
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

	
	public Cart getcart(String cid, String prod_id, String prod_price, String quantity, String total_amount) {
		// TODO Auto-generated method stub
		return null;
	}
   @Transactional
	public void insertORupdate(Cart cart)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}
    @Transactional
	public void delCart(String cid) {
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

}
