package com.mahesh.besics.springDemo.basic;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BinerySearchImpl  {

	@Autowired
	private SortAlgo bubbleSort;
	
	private static final Logger LOG = LoggerFactory.getLogger(BinerySearchImpl.class);
	
	
	public int binerySearch(int[] numbers,int  numberToSearch)
	{	
		int[] sortedNumbers = bubbleSort.sort(numbers);
		System.out.println(bubbleSort);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct()
	{
		LOG.info("PostCOnstruct");
	}
	
	@PreDestroy
	public void preDestroy()
	{
		LOG.info("PreDestroy");
	}
	
}
