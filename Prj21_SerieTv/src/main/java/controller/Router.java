package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


//quando tomcat passa a quesoto indirizzo, guarda se c'è un oggetto router, l'oggetto sarà associato alla nostra sessione


@WebServlet("/") //quando chiamerà il sito risponderà questa servlet
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String msg = "Benvenuti nel sito delle Serie TV";
		
		if (request.getParameter("q")!= null) {
			msg += "Ciao " + request.getParameter("q");
		}
		
		//includo header. Se chiami router,intercetta header e includo il contenuto della pagina, passando req e resp
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		
		response.getWriter().append( "<h1>" + msg + "</h1>");
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}
