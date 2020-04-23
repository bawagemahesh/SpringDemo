package com.mahesh.basics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ReadProperties {
	
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceUrl()
	{
		return url;
	}

}
