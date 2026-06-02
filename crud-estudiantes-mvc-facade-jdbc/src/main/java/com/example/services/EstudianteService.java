package com.example.services;

import java.sql.SQLException;

public interface EstudianteService {
	
	// Método para comprobar la conexión a la base de datos.
	public abstract boolean isConnectionOK() throws SQLException;

}
