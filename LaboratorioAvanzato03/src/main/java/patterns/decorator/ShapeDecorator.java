package patterns.decorator;

public abstract class ShapeDecorator implements Shape{

	protected Shape formaDecorata;
	
	public ShapeDecorator(Shape decorata) {
		this.formaDecorata = decorata;
	}
	
	@Override
	public void draw() {
		this.formaDecorata.draw();
		
	}
}
