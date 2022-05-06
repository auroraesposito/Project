package patterns.decorator;

public class DemoDecorator {

	public static void main(String[] args) {
		Shape cerchioBase = new Cerchio();
		
		Shape cerchioRosso = new RedShapeDecorator(new Cerchio());
		
		cerchioBase.draw();
		
		cerchioRosso.draw();
	}
	
	
	
}
