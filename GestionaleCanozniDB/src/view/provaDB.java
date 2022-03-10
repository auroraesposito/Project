package view;

import controller.CanzoneCtrl;
import model.Canzone;

public class provaDB {

	public static void main(String[] args) {
		
		CanzoneCtrl ctrl = new CanzoneCtrl();
		ctrl.addCanzone(new Canzone("brividissimi", "blanco", "poppp", 2020));
		
		
	}

}
