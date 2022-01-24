package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prodotto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Servlet implementation class prodotti
 */
@WebServlet("/prodotti")
public class Prodotti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prodotti() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		List<Prodotto> prodotti = new ArrayList<>();
		Map<Integer, Prodotto> dbProdotti = DB.getProdotti();
		
		Collection<Prodotto> values = dbProdotti.values();
		
		for (Prodotto prodotto : values) {
			prodotti.add(prodotto);
			
		}
		
		request.setAttribute("prodotti", prodotti);
	
		request.getRequestDispatcher("elenco.jsp").include(request, response);
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
