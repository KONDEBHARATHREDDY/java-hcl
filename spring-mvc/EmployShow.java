package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployShow {
public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Query q=s.createQuery("from Employ");
	List<Employ>employList=q.list();
	for (Employ employ : employList) {
		System.out.println(employ.getEmpno());
		System.out.println(employ.getName());
		System.out.println(employ.getDept());
		System.out.println(employ.getDesig());
		System.out.println(employ.getBasic());
		
	}
}
}
