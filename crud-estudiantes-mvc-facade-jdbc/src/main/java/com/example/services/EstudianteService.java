package com.example.services;

import java.sql.SQLException;
import java.util.List;

import com.example.models.Estudiante;

public interface EstudianteService {
	
	// Método para comprobar la conexión a la base de datos.
	public abstract boolean isConnectionOK() throws SQLException, Exception;
		
		List<Estudiante> getEstudiantes();

}
