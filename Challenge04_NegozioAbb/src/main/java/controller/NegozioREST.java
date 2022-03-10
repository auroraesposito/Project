package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prodotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;

import com.google.gson.Gson;

/**
 * Servlet implementation class NegozioREST
 */
@WebServlet("/api/negozio")
public class NegozioREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestioneNegozioImpl gestioneNegozio;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NegozioREST() {
        super();
        this.gestioneNegozio = new GestioneNegozioImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //da rifare dopo jsp
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		JSONArray collezione;
		
		if (request.getParameter("prodotto")!= null) {
			collezione =
					new JSONArray(this.gestioneNegozio
							.TuttiProdotti()
							.stream()
							.filter(p -> p.getNome().contains(request.getParameter("prodotto")))
							.collect(Collectors.toList())
							);
		} else {
			List<String> prodotti = this.gestioneNegozio
									.TuttiProdotti()
									.stream()
									.map(p -> p.getNome())
									.distinct()
									.collect(Collectors.toList());
			
			collezione=
					new JSONArray(prodotti);
		}
		
		response.setContentType("application/json");
		response.getWriter().append(collezione.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 mi faccio ritornare un buffer con la string 
				BufferedReader reader = request.getReader();
				
				//2 creo un GSON
				Gson gson = new Gson();
				
				//3 riverso la il buffer nel gson
				Prodotto p = gson.fromJson(reader, Prodotto.class);
				
				//4 aggiungo la canzone al mio db attraverso il ctrl
				this.gestioneNegozio.addProdotto(p);
				
				//5 chiama il metodo doGet per mostrare l'elenco di canzoni
				doGet(request, response);
		
	}

}
