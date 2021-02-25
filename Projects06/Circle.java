package projects06;

public class Circle extends GeometricObject {
	private double r;
	
	public Circle() {
	}
	
	public Circle(String color, boolean filled, double r) {
		super(color, filled);
		this.r = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public String toString() {
		return "Circle " + super.toString();
	}

}
