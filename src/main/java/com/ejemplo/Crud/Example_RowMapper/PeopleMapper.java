package com.ejemplo.Crud.Example_RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ejemplo.Crud.Example.Modelo.PeopleModel;

public class PeopleMapper implements RowMapper<PeopleModel> {

	@Override
	public PeopleModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		PeopleModel people = new PeopleModel();
		people.setIdPeople(rs.getInt("IdPeople"));
		people.setNombre(rs.getString("Nombre"));
		people.setApellido(rs.getString("Apellido"));
		people.setDui(rs.getString("Dui"));
		people.setGenero(rs.getString("Genero"));
		return people;
	}
}
