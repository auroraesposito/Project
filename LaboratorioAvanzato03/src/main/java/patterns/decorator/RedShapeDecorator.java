package patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	 public RedShapeDecorator(Shape formaDaDecorare) {
		super(formaDaDecorare);
	}

	 @Override
	public void draw() {
		// TODO Auto-generated method stub
		formaDecorata.draw();
		setBordoRosso(formaDecorata);
	}
	 
	private void setBordoRosso(Shape decorata) {
		System.out.println("Ho aggiunto un bel bordo rosso");
	}

}
