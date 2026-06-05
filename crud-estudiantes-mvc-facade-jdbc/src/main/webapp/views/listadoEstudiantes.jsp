<%@page import="java.util.List"%>
<%@page import="com.example.models.Estudiante"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado_Estudiantes</title>
</head>
<body>
	<%
		// Obtenemos la lista de estudiantes del atributo de la solicitud.
		// Y le hemos casteado la lista de estudiantes un poco a lo bruto.
		List<Estudiante> estudiantes = (List<Estudiante>) request.getAttribute("estudiantes");
	
	%>
	<h1>Listado de Estudiantes</h1>
	
	<!-- botón del formulario -->
	<div>
		<a href="AltaController" title="Muestra el formulario de alta o modificación de estudiantes">
			Alta de Estudiante
		</a>
	</div>
	
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Primer Apellido</th>
				<th>Segundo Apellido</th>
				<th>Fecha de Alta</th>
				<th>Genero</th>
				<th>Beca Concedida</th>
			
			</tr>
		</thead>	
		<tbody> <!-- una fila por cada registro de la tabla  -->
		   
               <%
               
               // for mejorado para recorrer la lista de estudiantes y mostrar sus datos en la tabla.
               	for (Estudiante estudiante : estudiantes) {
               	%>
               	<tr>
               		<td><%=estudiante.nombre() %></td>
               		<td><%=estudiante.primerApellido() %></td>
               		<td><%=estudiante.segundoApellido() %></td>
               		<td><%=estudiante.fechaAlta() %></td>
               		<td><%=estudiante.genero() %></td>
               		<td><%=estudiante.becaConcedida() %></td>
               	</tr>
               	
               	<%
               	}
              
               %>
		
		</tbody>
		
	</table>
	


</body>
</html>