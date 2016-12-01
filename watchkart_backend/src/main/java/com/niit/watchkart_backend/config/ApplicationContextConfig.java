
package com.niit.watchkart_backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.watchkart_backend.Dao.CartDao;
import com.niit.watchkart_backend.Dao.CartDaoImpl;
import com.niit.watchkart_backend.Dao.CategoryDao;
import com.niit.watchkart_backend.Dao.CategoryDaoImpl;
import com.niit.watchkart_backend.Dao.ProductDao;
import com.niit.watchkart_backend.Dao.ProductDaoImpl;
import com.niit.watchkart_backend.Dao.SupplierDao;
import com.niit.watchkart_backend.Dao.SupplierDaoImpl;
import com.niit.watchkart_backend.Dao.UserDetailsDao;
import com.niit.watchkart_backend.Dao.UserDetailsDaoImpl;
import com.niit.watchkart_backend.Dao.UsersDao;
import com.niit.watchkart_backend.Dao.UsersDaoImpl;
import com.niit.watchkart_backend.model.Cart;
import com.niit.watchkart_backend.model.Category;
import com.niit.watchkart_backend.model.Product;
import com.niit.watchkart_backend.model.Supplier;
import com.niit.watchkart_backend.model.UserDetails;
import com.niit.watchkart_backend.model.Users;


@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContextConfig {
	

    
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName("org.h2.Driver");
    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/ecomdb");
    	dataSource.setUsername("sa");
    	dataSource.setPassword("");
    	
    	return dataSource;
    }
    
    
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.format_sql", "true");
    	properties.put("hibernate.hbm2ddl.auto", "update");
    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
    	return properties;
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
     	sessionBuilder.addAnnotatedClasses(Users.class);
     	sessionBuilder.addAnnotatedClasses(Category.class);
     	sessionBuilder.addAnnotatedClasses(Supplier.class);
     	sessionBuilder.addAnnotatedClasses(Product.class);
     	sessionBuilder.addAnnotatedClasses(Cart.class);
     	sessionBuilder.addAnnotatedClasses(UserDetails.class);
    	return sessionBuilder.buildSessionFactory();
    }
    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
    
    
     @Autowired
     @Bean(name="usersDao")
     public UsersDao getusersDao(SessionFactory sessionFactory)
     {
    	 return new UsersDaoImpl(sessionFactory);
    }
     @Autowired
     @Bean(name = "users")
     public Users getUser()
     {
    	 return new Users();
     }
     
     @Autowired
     @Bean(name="categoryDao")
     public CategoryDao getcategoryDao(SessionFactory sessionFactory)
     {
    	 return new CategoryDaoImpl(sessionFactory);
    }
     @Autowired
     @Bean(name = "category")
     public Category getCategory()
     {
    	 return new Category();
     }
     
     @Autowired
     @Bean(name="supplierDao")
     public SupplierDao getsupplierDao(SessionFactory sessionFactory)
     {
    	 return new SupplierDaoImpl(sessionFactory);
    } 
     @Autowired
     @Bean(name = "supplier")
     public Supplier getSupplier()
     {
    	 return new Supplier();
     }
     
     @Autowired
     @Bean(name="productDao")
     public ProductDao getproductDao(SessionFactory sessionFactory)
     {
    	 return new ProductDaoImpl(sessionFactory);
    }
     @Autowired
     @Bean(name = "product")
     public Product getProduct()
     {
    	 return new Product();
     }
     
     
     @Autowired
     @Bean(name="cartDao")
     public CartDao getcartDao(SessionFactory sessionFactory)
     {
    	 return new CartDaoImpl(sessionFactory);
    }
     @Autowired
     @Bean(name = "cart")
     public Cart getCart()
     {
    	 return new Cart();
     }
     
     @Autowired
     @Bean(name="userdetailsDao")
     public UserDetailsDao getuserdetailsDao(SessionFactory sessionFactory)
     {
    	 return new UserDetailsDaoImpl(sessionFactory);
     }
     @Autowired
     @Bean(name = "userdetails")
     public UserDetails getUserdetails()
     {
    	 return new UserDetails();
     }

 
}
   
     
    
     
    
     
   
   
     
     
     
