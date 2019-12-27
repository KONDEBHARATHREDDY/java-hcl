package com.pack.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pack.dao.CustomerDao;
import com.pack.form.Customer;
import com.pack.form.CustomerController;
@Service
public class CustomerServiceImpl implements CustomerService {

	private static Logger log=Logger.getLogger(CustomerServiceImpl.class);
	private CustomerDao customerdao;

	public void setCustomerdao(CustomerDao customerdao) {
		this.customerdao = customerdao;
	}
@Transactional
	public List<Customer> listCustomer() {
	log.info("Inside service's listcustomer");
	List<Customer> l=customerdao.listCustomer();
	return l;


	}

}
