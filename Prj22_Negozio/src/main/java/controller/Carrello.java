package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prodotto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class Carrello
 */

@WebServlet("/carrello")
public class Carrello extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private List<Prodotto> prodotti;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public Carrello() {
    	
        this.prodotti = new ArrayList<>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if(request.getSession().getAttribute("carrello")!= null) {
			this.prodotti = (List<Prodotto>)request.getSession().getAttribute("carrello");
		} else {
			this.prodotti = new ArrayList<Prodotto>();
		}
		
		request.getRequestDispatcher("header.jsp").include(request, response);
//		request.setAttribute("prodotti", prodotti);
		request.getSession().setAttribute("prodotti", prodotti);
		request.getRequestDispatcher("elencoCarrello.jsp").include(request, response);
	
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("carrello")!= null) {
			this.prodotti = (List<Prodotto>)request.getSession().getAttribute("carrello");
		}else {
			this.prodotti = new ArrayList<Prodotto>();
		}
		
		
		if (request.getParameter("codProdotto")!= null) {
			int i = Integer.parseInt(request.getParameter("codProdotto"));
			Prodotto p = DB.getProdotti().get(i);
			
			try {
				if(p!= null)
				this.prodotti.add((Prodotto)p.clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		request.getSession().setAttribute("carrello", this.prodotti);
		doGet(request, response);
		
		
	}

}
