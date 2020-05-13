package br.com.jdbctemplate.domain.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.jdbctemplate.domain.model.Usuario;

@Repository
public class Usuarios {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Usuario> listar() {
		return jdbcTemplate.query(getSql(),
				(rs, rowNum) -> new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
	}

	public Usuario buscar(Integer id) {
		return jdbcTemplate.queryForObject(getSql() + "WHERE id = ?", new Object[] { id },
				(rs, rowNum) -> new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
	}
	
	private String getSql() {
		return "SELECT * FROM usuario ";
	}

}
