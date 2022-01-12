package controller;

import model.ToDo;

public class ToDoCtrl {

	//quarto passo: creo una classe controller e aggiungo proprietà (contenitore di ToDo).
	//Per poter creare un array ToDo, devo importare ToDo prima di poterlo usare
	
		private  ToDo[] spesa; {
			System.out.println("hai un nuovo controller");
			this.spesa = new ToDo [10];
	}
	
	//quinto passo: aggiungo metodo per aggiungere toDo. metto in argomento una descrizione e una posizione
		
		public void addTodo (String desc, int pos) {
			ToDo temp = new ToDo(desc); //riferimento temporaneo al todo
			this.spesa[pos] = temp; //assegno una posizione al todo temporaneo
			
		}
		
	//sesto passo: metodo che stampa tutti i ToDo
	//scorre la lista di ToDo, e se c'è un ToDo dentro, lo stampa
		public void stampaLista() {
			for (int i = 0; i < spesa.length; i++) {
				
				if (spesa[i] != null) {
					if (spesa[i].isCompleto()) {
						System.out.print("[*]");
						
					} else {
						System.out.print("[ ]");
					}
					//se voglio sapere se il task è completo
					//System.out.println(spesa[i].isCompleto());
					
					//se non voglio ridare solo true o false
					//metto un if: if (spesa[i].isCompleto()) {syso ("[*]")}
									//else {syso ("[ ]")}
					System.out.println(spesa[i].getDescrizione()); //spesa è una posizione della lista, se c'è un oggetto alla posizione i, mi faccio dare una descrizione			
				}
				
			}
			
			
		}
	
	//ottavo passo: faccio un metodo per completare
	public void completa(int pos) {
		if(this.spesa[pos] != null) {
			this.spesa[pos].setCompleto(true);
		}
	}
	
}
