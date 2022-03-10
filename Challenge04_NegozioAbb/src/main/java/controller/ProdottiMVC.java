package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Prodotto;

import java.io.IOException;

/**
 * Servlet implementation class ProdottiMVC
 */
@WebServlet("/prodotti")
public class ProdottiMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestioneNegozioImpl gestioneNegozio;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdottiMVC() {
        super();
        this.gestioneNegozio = new GestioneNegozioImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		for (Prodotto p  : this.gestioneNegozio.TuttiProdotti()) {
			sb.append(p);
		}
		
		for (Cliente c : this.gestioneNegozio.TuttiClienti()) {
			sb.append(c);
		}
		response.getWriter().append(sb.toString());
		
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
