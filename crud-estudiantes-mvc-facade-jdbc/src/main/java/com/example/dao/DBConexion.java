package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;

public class DBConexion {
	
	private String user;
	private String password;
	private Connection connection;
	
	// Logger para registrar eventos relacionados con la conexión a la base de datos
	// Loger es de java.util.logging.
	
	private static final Logger LOG = Logger.getLogger("DBConexion");
	
	public DBConexion(String user, String pasword) {
		super();
		this.user = user;
		this.password = password;
		
	}
	
	// Método para establecer la conexión a la base de datos, a la que llama:
	
	public Connection getConnection() throws ClassNotFoundException {
		
	// Definimos la URL de conexión a la DB con su puerto y todo del proyecto:
		
		String urlConnection = "jdbc:mysql://localhost:3306/empresa-crud-empleados";
		
	// Especificamos usuario y contraseña en objeto Properties, con info.put,
	// para meter user y password. Así se lo damos a DriverManager.getConnection.
		
		Properties info = new Properties();

			info.put("user", this.user);
			info.put("password", this.password);
			
	// Con este método tenemos que manejar las posibles excepiones. Nos pusimos sobre
	// lo subrayado en rojo y sorround with try-catch, que nos añade un manejo de excepciones
	// necesario.
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
	// Arriba hay que pasar el driver de conexión en libraries, Maven Dependencies y el nobre que vemos entre comillas.
	// al class le agregamos un throw para manejar la excepción de ClassNotFoundException, que es la que se lanza si no encuentra el driver de conexión.
				
			this.connection = DriverManager.getConnection(urlConnection, info);
				LOG.info("¡¡Conectado a la base de datos correctamente!!"); // nos olvidamos de println para la consola, ahora todo al LOG.
			} catch (SQLException e) {
				LOG.info("¡¡Error de conexión a la base de datos!!");
				e.printStackTrace();
			}
			
			return this.connection;
		}

		
	}

