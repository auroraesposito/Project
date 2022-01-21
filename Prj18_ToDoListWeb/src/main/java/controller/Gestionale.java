package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Gestionale
 */

@WebServlet("/pippo")
public class Gestionale extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//prendi l'oggetto risposta, dall'oggetto risposta prendi il writer (caratteri in uscita), aggiungi al flusso di caratteri aggiungi la stringa "".
		response.setContentType("text/html");
		response.getWriter().append("<h1>Sta funzionando, ho chiamato la mia servlet via get </h1>").append(request.getContextPath());
	}

}
