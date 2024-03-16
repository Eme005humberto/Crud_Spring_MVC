<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	left: 200px;
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
		<h1>¿Seguro que deseas eliminar este registro?</h1>
		<br>
		<form action="EliminarRegistro" method="GET">
		    <input type="hidden" name="IdPeople" value="${usuario.idPeople}">
			<label for="nombre">Nombre: ${usuario.nombre }</label>
			<br>
			<label for="apellido">Apellido: ${usuario.apellido }</label>
			<br>
			<label for="dui">Dui: ${usuario.dui }</label>
			<br>
		    <label for="genero">Genero: ${usuario.genero }</label>
			<br>
			<input class="btn btn-danger" type="submit" value="Eliminar registro">
		</form>
	</div>
</body>
</html>