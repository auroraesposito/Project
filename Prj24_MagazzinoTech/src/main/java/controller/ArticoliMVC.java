package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;

import java.io.IOException;

/**
 * Servlet implementation class ArticoliMVC
 */
@WebServlet("/articoli")
public class ArticoliMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Articoli articoli;
       
    public ArticoliMVC() {
        super();
        this.articoli= new Articoli();
        
        for (Articolo a  : db.Articoli.getALL().values()) {
			this.articoli.addArticolo(a);
		}
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setAttribute("articoli", articoli.getArticoliList());
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
