<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Personas Naturales</title>
<style>
h1 {
	position: relative;
	left: 400px;
	font-family: Times New Roman;
	top: 10px;
}

.agregar {
	position: relative;
	left: 130px;
	rigth: 50px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Modificar registro</h1>
		<form action="GuardarCambios" method="POST" >
		    <input type="hidden" name="IdPeople" value="${usuario.idPeople}">
			<label>Ingrese el nombre: </label> 
			<input type="text" class="form-control" name="Nombre" value="${usuario.nombre }"> <br> 
			<label>Ingrese el apellido: </label> 
			<input type="text" class="form-control" name="Apellido" value="${usuario.apellido }"> 
			<br> 
			<label>Ingrese el Dui:</label>
			<input type="text" class="form-control" name="Dui" value="${usuario.dui }">
			<br>
			<label>Ingrese el genero: </label>
			<input type="text" class="form-control" name="Genero" value="${usuario.genero }"> 
			<br> 
			<input class="btn btn-primary" type="submit" value="Modificar registro">
				<br><br>
		</form>
	</div>
</body>
</html>