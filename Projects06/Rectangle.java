package projects06;

public class Rectangle extends GeometricObject {
	private double side;
	
	public Rectangle() {
	}
	
	public Rectangle(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public String toString() {
		return "Rectangle " + super.toString();
	}

}

