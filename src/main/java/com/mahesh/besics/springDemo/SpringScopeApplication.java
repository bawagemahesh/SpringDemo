package com.mahesh.besics.springDemo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mahesh.besics.springDemo.scope.PersonDao;

public class SpringScopeApplication {
	
	
    private static final Logger LOG = LoggerFactory.getLogger(SpringScopeApplication.class);
	public static void main(String[] args) {
		
	//	BinerySearchImpl binerySearchImpl = new  BinerySearchImpl(new QuickSort());
		int[] numbers={2,4,3,6 ,5 };
	//	int result = binerySearchImpl.binerySearch(numbers, 3);
	//	System.out.println(result);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringScopeApplication.class);
		PersonDao personDao= applicationContext.getBean(PersonDao.class);
		PersonDao personDao2= applicationContext.getBean(PersonDao.class);
		
		LOG.info(" personDao -1 " , personDao);
		LOG.info("{}" , personDao.getJdbcConnection());
		
		LOG.info("{}+ personDao 2" , personDao2);
		LOG.info("{}" , personDao2.getJdbcConnection());
	}

}
