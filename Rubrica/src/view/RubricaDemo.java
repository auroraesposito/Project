package view;

import controller.RubricaController;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {
		RubricaController ctrl = new RubricaController();
		
		ctrl.addContatto("Pippo", "3345862458");
		ctrl.addContatto("Pino", "3345863458");
		ctrl.addContatto("Rino", "3345342458");
		ctrl.addContatto("Mimmo", "3345863455");
		ctrl.addContatto("Pippo", "3345862458");
		ctrl.addContatto("Pino", "3345863458");
		ctrl.addContatto("Rino", "3345342458");
		ctrl.addContatto("Mimmo", "3345863455");
		ctrl.addContatto("Pippo", "3345862458");
		ctrl.addContatto("Pino", "3345863458");
		ctrl.addContatto("Rino", "3345342458");
		ctrl.addContatto("Mimmo", "3345863455");

//		for (int i = 0; i <ctrl.getContatti().length; i++) {
//			System.out.println(ctrl.getContatti()[i]);
//			
//		}
		
		for (Contatto c : ctrl.getContatti()) {
			System.out.println(c);
		}
	}

}
