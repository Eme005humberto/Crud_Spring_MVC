package com.ejemplo.Crud_Example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ejemplo.Crud.Example.Modelo.PeopleModel;
import com.ejemplo.Crud_Example.DAO.ServiciosDAO;


@Controller
public class HomeController {
	@Autowired
	private ServiciosDAO servicio;
	
	@RequestMapping(value = "/")
	 public ModelAndView mostrarPaginaPrincipal() {
       return new ModelAndView("UsuariosRegistrados"); // Nombre de la vista de la página principal
   }
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ModelAndView listarUsuarios(ModelAndView model) {
		List<PeopleModel> lista = servicio.AllUsers();
		model.addObject("lista",lista);
		model.setViewName("UsuariosRegistrados");
		return model;
	}
	@RequestMapping(value = "/Agregar",method = RequestMethod.GET)
	public ModelAndView AgregarUsuarios(ModelAndView model) {
		PeopleModel modelo = new PeopleModel();
		model.addObject("usuario",modelo);
		model.setViewName("AgregarCiudadano");
		return model;
	}
	
	@RequestMapping(value = "/Guardar",method = RequestMethod.POST)
	public ModelAndView GuardarDatos(@ModelAttribute PeopleModel model) {
		servicio.AddUser(model);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/Modificar",method = RequestMethod.GET)
	public String Modificar(@RequestParam("id") int id, Model m) {
		PeopleModel modelo = servicio.Buscar(id);
		m.addAttribute("usuario",modelo);
		return "ModificarDatos";
	}
	@RequestMapping(value = "/GuardarCambios",method = RequestMethod.POST)
	public ModelAndView GuardarCambio(@ModelAttribute("usuario")PeopleModel model) {
		servicio.UpdateUser(model);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/Eliminar",method = RequestMethod.GET)
	public String Eliminar(@RequestParam("id")int id,Model m) {
		PeopleModel modelo = servicio.Buscar(id);
		m.addAttribute("usuario",modelo);
		return "EliminarCiudadano";
	}
	@RequestMapping(value = "/EliminarRegistro",method = RequestMethod.GET)
	public ModelAndView EliminarDato(HttpServletRequest request) {
		int Id = Integer.parseInt(request.getParameter("IdPeople"));
		servicio.DeleteUser(Id);
		return new ModelAndView("redirect:/");
	}
	
}
