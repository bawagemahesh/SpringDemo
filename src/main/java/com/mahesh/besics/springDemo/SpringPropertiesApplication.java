package com.mahesh.besics.springDemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.basics.properties.ReadProperties;
import com.mahesh.besics.springDemo.basic.BinerySearchImpl;
import com.mahesh.besics.springDemo.xml.XmlPersonDao;

@Configuration
@ComponentScan("com.mahesh.basics.properties")
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringPropertiesApplication.class))
		{
			ReadProperties readProperties= applicationContext.getBean(ReadProperties.class);
		
		System.out.println(" SpringBasicApplication---- "+readProperties.returnServiceUrl());
		}
	}
}
