package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prodotto;

import java.io.BufferedReader;
import java.io.IOException;

import org.json.JSONArray;

import com.google.gson.Gson;

/**
 * Servlet implementation class ProdottiREST
 */
@WebServlet("/api/prodotti")
public class ProdottiREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestioneNegozioImpl gestioneNegozio;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdottiREST() {
        super();
        this.gestioneNegozio = new GestioneNegozioImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONArray collezioneProdotti = new JSONArray(this.gestioneNegozio.TuttiProdotti());
		
		response.setContentType("application/json");
		response.getWriter().append(collezioneProdotti.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedReader reader = request.getReader();
		
		Gson gson = new Gson();
		
		Prodotto p = gson.fromJson(reader, Prodotto.class);
		
		this.gestioneNegozio.addProdotto(p);
		
		doGet(request, response);
	}

}
