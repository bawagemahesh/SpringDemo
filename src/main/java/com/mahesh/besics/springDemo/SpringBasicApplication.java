package com.mahesh.besics.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.besics.springDemo.basic.BinerySearchImpl;
import com.mahesh.besics.springDemo.xml.XmlPersonDao;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class SpringBasicApplication {

	public static void main(String[] args) {
		
	//	BinerySearchImpl binerySearchImpl = new  BinerySearchImpl(new QuickSort());
		int[] numbers={2,4,3,6 ,5 };
	//	int result = binerySearchImpl.binerySearch(numbers, 3);
	//	System.out.println(result);
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml"))
		{
		XmlPersonDao personDao= applicationContext.getBean(XmlPersonDao.class);
		
		System.out.println(" SpringBasicApplication---- "+personDao);
		System.out.println(" SpringBasicApplication getXmlJdbcConnection---- "+personDao.getXmlJdbcConnection());
		}
	}
}
