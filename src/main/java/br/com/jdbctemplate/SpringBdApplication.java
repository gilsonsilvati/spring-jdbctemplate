package br.com.jdbctemplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBdApplication {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBdApplication.class.getPackage().getName());
		
		applicationContext.close();
	}
}
