package br.com.jdbctemplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.jdbctemplate.domain.repository.Usuarios;

public class SpringBdApplication {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBdApplication.class.getPackage().getName());
		
		Usuarios usuarios = applicationContext.getBean(Usuarios.class);
		
		System.out.println(">>> listar");
		usuarios.listar().forEach(System.out::println);
		
		System.out.println("\n>>> buscar");
		System.out.println(usuarios.buscar(1));
		
		applicationContext.close();
	}
}
