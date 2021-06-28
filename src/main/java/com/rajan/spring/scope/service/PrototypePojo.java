package com.rajan.spring.scope.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author rajan
 *
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypePojo {

	private String date=LocalDateTime.now().toString();
	
	/**
	 * @return
	 */
	public String getDate() {
		return date;
	}
}
