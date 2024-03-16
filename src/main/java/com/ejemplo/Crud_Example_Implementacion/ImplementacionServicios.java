package com.ejemplo.Crud_Example_Implementacion;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.ejemplo.Crud.Example_RowMapper.PeopleMapper;
import com.ejemplo.Crud.Example.Modelo.PeopleModel;
import com.ejemplo.Crud_Example.DAO.ServiciosDAO;

public class ImplementacionServicios implements ServiciosDAO {

	
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	public ImplementacionServicios(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(datasource);
	}
	
	@Override
	public List<PeopleModel> AllUsers() {
		StringBuilder sql = new StringBuilder(100);
		sql.append("SELECT * FROM people");
		return jdbcTemplate.query(sql.toString(), new PeopleMapper());
		 
	}

	@Override
	public int AddUser(PeopleModel model) {
		StringBuilder sql = new StringBuilder(100);
		sql.append("INSERT INTO people(Nombre,Apellido,Dui,Genero)");
		sql.append("VALUES(:Nombre,:Apellido,:Dui,:Genero)");
		
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("Nombre", model.getNombre(),Types.VARCHAR);
		param.addValue("Apellido", model.getApellido(),Types.VARCHAR);
		param.addValue("Dui", model.getDui(),Types.VARCHAR);
		param.addValue("Genero", model.getGenero(),Types.VARCHAR);
		
		return namedParameterJdbcTemplate.update(sql.toString(), param);
	}

	@Override
	public int UpdateUser(PeopleModel model) {
		StringBuilder sql = new StringBuilder(100);
		//sql.append("UPDATE people");
		sql.append("UPDATE people SET Nombre = :Nombre, Apellido = :Apellido, Dui = :Dui, Genero = :Genero WHERE IdPeople = :IdPeople");
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("Nombre", model.getNombre(),Types.VARCHAR);
		param.addValue("Apellido", model.getApellido(),Types.VARCHAR);
		param.addValue("Dui", model.getDui(),Types.VARCHAR);
		param.addValue("Genero", model.getGenero(),Types.VARCHAR);
		param.addValue("IdPeople", model.getIdPeople(),Types.INTEGER);
		
		return namedParameterJdbcTemplate.update(sql.toString(), param);
	}

	@Override
	public int DeleteUser(int id) {
		StringBuilder sql = new StringBuilder(100);
		//sql.append("DELETE people WHERE IdPeople = :IdPeople");
		sql.append("DELETE FROM people WHERE IdPeople = :IdPeople");
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("IdPeople",id,Types.INTEGER);
		return namedParameterJdbcTemplate.update(sql.toString(), param);
		//return jdbcTemplate.queryForObject(sql, new PeopleMapper());
	}
	
	@Override
	public PeopleModel Buscar(int id) {
		String sql = "SELECT * FROM People WHERE IdPeople ="+id;
		return jdbcTemplate.queryForObject(sql, new PeopleMapper());
	}

	@Override
	public int SaveOrUpdate(PeopleModel model) {
		// TODO Auto-generated method stub
		return 0;
	}

}
