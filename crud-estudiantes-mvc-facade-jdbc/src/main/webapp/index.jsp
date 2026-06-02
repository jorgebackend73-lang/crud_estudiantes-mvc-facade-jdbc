<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proyecto Universidad</title>
</head>
<body>

	<!-- El patron de diseño MVC (Model-View-Controller) es una arquitectura
  de software
  que separa una aplicación en tres componentes principales: el Modelo,
  la Vista y el Controlador.
  Este patrón se utiliza para organizar el código de manera que sea más fácil
  de mantener y escalar.
 
  Concretamente, el patrón MVC se compone de los siguientes elementos:
  - Modelo: Es la parte de la aplicación que maneja los datos.
  - Vista serian los archivos JSP.
  - Controlador son los Servlets.  
 
  Conjuntamente con el patron MVC se usa el patrón facade:
  Divide el proyecto en capas. Capas facilmente sustituibles.
  Ocultan a la anterior capa las dificultades de la implementación.
 
  Cada capa se comunica con la siguiente a través de una interfaz común,
  lo que permite que las capas sean fácilmente intercambiables
  sin afectar a las demás capas.
  Cada capa es un paquete o módulo independiente que se encarga de una función específica
  dentro de la aplicación.
  Si queremos cambiar la implementación de una capa, solo necesitamos modificar esa capa
  sin afectar a las demás capas.
 
  Pj. Proyeco:
  1- Capa DAO (Data Acces Objects), equivale al modelo y es donde
  se implementa el acceso a base de datos con JDBC (Java Database Connectivity)
  2- Capa de Servicios.
  3- Capa de Controladores. Puede haver varios.
  4- Capa de Implementaciones.
  5- Capa Model.
  6- etc..-->
 
  <h1>CRUD Estudiantes MVC Facade JDBC</h1>
	<div>
		<a href="MainController">Mostrar Listado de Estudiantes</a>
	</div>

</body>
</html>