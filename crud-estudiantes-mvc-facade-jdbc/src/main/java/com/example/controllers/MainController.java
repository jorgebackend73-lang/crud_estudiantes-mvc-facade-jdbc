package com.example.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import com.example.models.Estudiante;
import com.example.services.EstudianteService;
import com.example.services.EstudianteServiceImpl;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/MainController")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger("MainController");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Conectar con la capa de servicios para obtener el listado de estudiante.
		EstudianteService estudianteService = new EstudianteServiceImpl();
		
		// Lista donde cada elemeto es un objeto de tipo Estudiante, con sus atributos.
		// Desde el controlador conectamos con la capa de servicios,
		// y esta a su vez con la capa DAO, para obtener el listado de estudiantes.
		List<Estudiante> estudiantes = estudianteService.getEstudiantes();
		
		// El listado de estudiante recogido hay que enviarlo como atributo a la vista JSP,
		// para que sea renderizado, para que se muestre en la página web vamos.
		
		request.setAttribute("estudiantes", estudiantes); // ya tiene el listado de estudiantes aquí.
		
		// Hay que procesar el atributo.
		
		request.getRequestDispatcher("views/listadoEstudiantes.jsp").forward(request, response);
		// vista de listado de estudiantes de nuestra carpeta views.
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
