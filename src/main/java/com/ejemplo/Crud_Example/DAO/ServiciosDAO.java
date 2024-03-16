package com.ejemplo.Crud_Example.DAO;

import java.util.List;

import com.ejemplo.Crud.Example.Modelo.PeopleModel;

public interface ServiciosDAO {
	
	public List<PeopleModel> AllUsers();
	
	public int AddUser(PeopleModel model);
	
	public int UpdateUser(PeopleModel model);
	
	public int DeleteUser(int id);
	
	public PeopleModel Buscar(int id);
	
	public int SaveOrUpdate(PeopleModel model);
}
