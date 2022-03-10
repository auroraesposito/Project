package integration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.LibroService;
import service.LibroServiceImpl;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;

import entities.Libro;


@WebServlet("/api/libri")
public class LibroREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private LibroService service;
	
	
    public LibroREST() {
        super();
        this.service = new LibroServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Libro> libri = this.service.getAll();
		JSONArray array = new JSONArray(libri);
		
		response.setContentType("application/json");
		response.getWriter().append(array.toString());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("titolo")!= null) {
			String titolo = request.getParameter("titolo");
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			int pagine = Integer.parseInt(request.getParameter("pagine"));
			int editoreId = Integer.parseInt(request.getParameter("editore_id"));
			
			Libro l = new Libro(0, editoreId, titolo, prezzo, pagine);
			service.addLibro(l);
			
		}
		
		
		doGet(request, response);
	}

}
