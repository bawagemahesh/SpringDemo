package com.mahesh.besics.springDemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.mahesh.basics.componant.ComponantPersonDao;


@ComponentScan("com.mahesh.basics.componant")
public class SpringComponantApplication {
	
	
    private static final Logger LOG = LoggerFactory.getLogger(SpringComponantApplication.class);
	public static void main(String[] args) {
		
	//	BinerySearchImpl binerySearchImpl = new  BinerySearchImpl(new QuickSort());
		int[] numbers={2,4,3,6 ,5 };
	//	int result = binerySearchImpl.binerySearch(numbers, 3);
	//	System.out.println(result);
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringComponantApplication.class);
					
		ComponantPersonDao componantPersonDao= applicationContext.getBean(ComponantPersonDao.class);
		ComponantPersonDao componantPersonDao2= applicationContext.getBean(ComponantPersonDao.class);
		
		LOG.info(" componantPersonDao -1 " , componantPersonDao);
		LOG.info("{}" , componantPersonDao.getJdbcConnection());
		
		LOG.info("{}+ componantPersonDao 2" , componantPersonDao2);
		LOG.info("{}" , componantPersonDao2.getJdbcConnection());
	}

}
