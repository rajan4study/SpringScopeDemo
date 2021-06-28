package com.rajan.spring.scope.service;



import org.springframework.beans.factory.ObjectFactory;

//import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
//import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SingletonPojo {
	
//	@Autowired
//	private PrototypePojo prototypePjo;
	
//	@Autowired
//	ApplicationContext applicationContext;
	
//	@Autowired
//	private Provider<PrototypePojo> prototypePjoProvider;
	
	@Autowired
	private ObjectFactory<PrototypePojo> prototypePjoProvider;
	 
	/**
	 * @return
	 */
	public String displayDate() {
		//Prototype scope become singleton
		//return prototypePjo.getDate();
		
		//making prototypePojo prototype, but it break spring's IOC
		//return applicationContext.getBean(PrototypePojo.class).getDate();
		
		
		//return prototypePojo().getDate();
		
		//return prototypePjoProvider.get().getDate();
		
		return prototypePjoProvider.getObject().getDate();
	}
	
	@Lookup
	public PrototypePojo prototypePojo() {
		return null;
	}

}
