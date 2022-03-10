package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import controller.CanzoniCtrl;



@WebServlet("/canzoni")
public class CanzoniMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CanzoniCtrl ctrl; 
       
   
    public CanzoniMVC() {
        this.ctrl = new CanzoniCtrl();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listaCanzoni", this.ctrl.getCantanti());
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
