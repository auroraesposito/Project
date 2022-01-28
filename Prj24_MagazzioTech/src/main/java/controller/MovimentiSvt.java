package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;
import model.Movimento;

import java.io.IOException;
import db.Movimenti;

/**
 * Servlet implementation class Movimenti
 */
@WebServlet("/movimenti")
public class MovimentiSvt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MagazzinoCtrl ctrl;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovimentiSvt() {
		super();
		this.ctrl = new MagazzinoCtrl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("Movimenti", this.ctrl.getCtrlMovimenti().getMovimentiList());
		request.getRequestDispatcher("listaMovimenti.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("descrizione") != null) {
			String descrizione = request.getParameter("descrizione");
			int quantita = Integer.parseInt(request.getParameter("quantita"));
			int idArticolo = Integer.parseInt(request.getParameter("articolo"));
			Articolo articolo = ctrl.getCtrlArticoli().getArticolo(idArticolo);
			ctrl.getCtrlMovimenti().addMovimento(new Movimento(descrizione, quantita, articolo));
		}
		doGet(request, response);
	}

}
