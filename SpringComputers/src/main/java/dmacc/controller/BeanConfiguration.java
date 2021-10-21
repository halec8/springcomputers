package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computers;
import dmacc.beans.ShippingAddress;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */

@Configuration
public class BeanConfiguration {

	
	@Bean
	public Computers computers() {
		
		
		Computers bean = new Computers();
		bean.setBrand("Apple");
		bean.setModel("Macbook Pro");
		bean.setType("Laptop");
		bean.setScreenSize(15);
		bean.setYearReleased(2021);
		
		return bean;
	}
	
	@Bean
	public ShippingAddress shippingAddress() {
		ShippingAddress bean = new ShippingAddress("2833 Hummingbird Way", "Zenda", "Wisconsin");
		
		return bean;
	}
}
