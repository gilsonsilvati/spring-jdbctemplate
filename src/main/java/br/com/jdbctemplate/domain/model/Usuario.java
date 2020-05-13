package br.com.jdbctemplate.domain.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@ToString
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String email;

}
