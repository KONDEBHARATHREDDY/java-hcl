package com.pack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pack.form.Customer;
import com.pack.service.CustomerServiceImpl;
@Repository
public class CustomerDaoImpl implements CustomerDao {
private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
	this.sessionfactory = sessionfactory;
}
	private static Logger log=Logger.getLogger(CustomerDaoImpl.class);
	public List<Customer> listCustomer() {
		Query q=sessionfactory.getCurrentSession().createQuery("from customer");
		List l=q.list();
		return l;
	}

}
