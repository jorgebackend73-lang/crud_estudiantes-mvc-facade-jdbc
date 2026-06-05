package com.example.services;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.dao.DBConexion;
import com.example.models.Estudiante;
import com.example.models.Genero;

public class EstudianteServiceImpl implements EstudianteService{
	
	@Override
	public boolean isConnectionOK() throws SQLException {
		// TODO Auto-generated method stub
		
		// Con esto conectamos la capa de servicios con la capa DAO:
		DBConexion dbConexion = new DBConexion("root", "Temp2026");
		
		//TODO cerrar la conexion
		
			boolean connectionOk = false;
			
			// varible local por el try catch añadido abajo, hay que iniciarla a null.
			Connection connection = null; 
			
			
			try {
				connection = dbConexion.getConexion();
				if (connection != null)
					connectionOk = true;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (connection != null)
					connection.close();
			}
			
			
			return connectionOk;
	}

	@Override
	public List<Estudiante> getEstudiantes() {
		
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		try (DBConexion dbConexion = new DBConexion("root", "Temp2026"); 
				Connection connection = dbConexion.getConexion()) {
			
			ResultSet rs = dbConexion.getEstudiantes(connection);
			
			while (rs.next()) {
				
				estudiantes.add(
				Estudiante.builder()
					.id(rs.getInt("id"))
					.primerApellido(rs.getString("primerApellido"))
					.segundoApellido(rs.getString("segundoApellido"))
					.fechaAlta(rs.getDate("fechaAlta").toLocalDate())
					.genero(Genero.valueOf(rs.getString("genero")))
					.becaConcedida(new BigDecimal(rs.getDouble("becaConcedida")))
					.Facultades_id(rs.getInt("Facultades_id"))
					.build()
					);
							
											
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return estudiantes;
	}
	

}
