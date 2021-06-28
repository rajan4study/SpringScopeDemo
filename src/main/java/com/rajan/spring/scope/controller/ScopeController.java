package com.rajan.spring.scope.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajan.spring.scope.service.SingletonPojo;

/**
 * @author rajan
 * 
 * ScopeContoller- rest controller class
 *
 */

@RestController
public class ScopeController {
	
	@Autowired
	private SingletonPojo singletonPojo;
	
	
	@GetMapping("/getDate")
	public List<String> getMethod() throws InterruptedException{
		String first=singletonPojo.displayDate();
		Thread.sleep(2000);
		String second=singletonPojo.displayDate();
		return Arrays.asList(first,second);
	}

}
