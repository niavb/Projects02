package projects06;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		setDateCreated(new java.util.Date());
	}
	
	public GeometricObject(String color, boolean filled) {
		setDateCreated(new java.util.Date());
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public static int max(GeometricObject go1, GeometricObject go2) {
		if(go1.getArea()>go2.getArea()) {
			return 1;
		}else if(go1.getArea()<go2.getArea()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public int compareTo(GeometricObject go) {
		// TODO Auto-generated method stub
		if(this.getArea()>go.getArea()) {
			return 1;
		}else if(this.getArea()<go.getArea()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public abstract double getArea();

	public abstract double getPerimeter();
	

}
