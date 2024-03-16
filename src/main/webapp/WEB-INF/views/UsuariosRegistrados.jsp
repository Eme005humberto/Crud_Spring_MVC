<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuarios Registrados</title>
<style>
h1 {
	position: relative;
	left: 400px;
	font-family:Times New Roman;
	top:10px;
}

.agregar {
	position: relative;
	left: 130px;
	rigth: 50px;
}
</style>
</head>
<body>
	<h1 class="text-primary">Registro de Personas Naturales</h1>
	<div class="agregar">
		<a href="Agregar" class="btn btn-success">Agregar nuevo registro <i class="fas fa-user-plus"></i></a>
	</div>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Id Persona</th>
					<th scope="col">Nombre</th>
					<th scope="col">Apellido</th>
					<th scope="col">Dui</th>
					<th scope="col">Genero</th>
					<th scope="col">Modificar</th>
					<th scope="col">Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="usuario" items="${lista}">
					<tr>
						<td>${usuario.idPeople}</td>
						<td>${usuario.nombre }</td>
						<td>${usuario.apellido }</td>
						<td>${usuario.dui }</td>
						<td>${usuario.genero }</td>
						<td><a href="Modificar?id=${usuario.idPeople }" class="btn btn-warning"><i class="fas fa-edit"></i></a></td>
						<td><a href="Eliminar?id=${usuario.idPeople }" class="btn btn-danger"><i class="fas fa-trash-alt"></i></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>