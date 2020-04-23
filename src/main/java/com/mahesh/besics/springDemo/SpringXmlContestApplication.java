package com.mahesh.besics.springDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.besics.springDemo.basic.BinerySearchImpl;
import com.mahesh.besics.springDemo.xml.Address;
import com.mahesh.besics.springDemo.xml.Customer;
import com.mahesh.besics.springDemo.xml.XmlPersonDao;

@PropertySource("classpath:application.properties")
public class SpringXmlContestApplication {

	private static Logger LOG = LoggerFactory.getLogger(SpringXmlContestApplication.class);
	
	public static void main(String[] args) {
	
		//	BinerySearchImpl binerySearchImpl = new  BinerySearchImpl(new QuickSort());
		int[] numbers={2,4,3,6 ,5 };
	//	int result = binerySearchImpl.binerySearch(numbers, 3);
	//	System.out.println(result);
		
		
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
		XmlPersonDao personDao= applicationContext.getBean(XmlPersonDao.class);
		Customer customer = applicationContext.getBean(Customer.class);
		
		LOG.info("Customer - "+customer);
		
		LOG.info(" SpringBasicApplication---- "+personDao);
		LOG.info(" SpringBasicApplication getXmlJdbcConnection---- "+personDao.getXmlJdbcConnection());
		}
	}

}
