package controller;

import java.util.ArrayList;

import model.ToDo;

public class ToDoCtrl {

	// private ToDo[] spesa;

	private ArrayList<ToDo> lista = new ArrayList<>(); // nella lista non ho bisogno dell'indice di posizione

	// inizializzazione all'interno del metodo costruttore
	public ToDoCtrl() {
		System.out.println("hai un nuovo controller");
		// this.spesa = new ToDo [10];
		this.lista = new ArrayList<>();
	}

	public void addTodo(String desc, int pos) {
		ToDo temp = new ToDo(desc); // riferimento temporaneo al todo
		// this.spesa[pos] = temp; //assegno una posizione al todo temporaneo
		this.lista.add(temp); // aggiunge un todo alla fine della lista
	}

	public void stampaLista() {
		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) != null) {
				if (lista.get(i).isCompleto()) {
					System.out.print("[*]");

				} else {
					System.out.print("[ ]");
				}

				System.out.println(lista.get(i).getDescrizione()); // spesa è una posizione della lista, se c'è un
																	// oggetto alla posizione i, mi faccio dare una
																	// descrizione
			}

		}

	}

	public void completa(int pos) {
		if (this.lista.get(pos) != null) {
			this.lista.get(pos).setCompleto(true);
		}
	}

}
