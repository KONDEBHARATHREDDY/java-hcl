package com.pack.form;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.service.CustomerService;

@Controller
public class CustomerController {

	private static Logger log=Logger.getLogger(CustomerController.class);
	private CustomerService customerservice;
	
	@Autowired(required=true)
	@Qualifier(value="customerservice")
	public void setCustomerservice(CustomerService customerservice) {
		this.customerservice = customerservice;
	}


	@RequestMapping(value="/index")
	public String listCustomer(Map<String,Object>map) {
		map.put("customer", new Customer());
		map.put("customerList",customerservice.listCustomer());
		log.info("Inside list customer");
		return "customer";
	}
	
	
}
