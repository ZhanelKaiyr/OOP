package subtask3;

public class Circle implements GeometricObject {
	protected double radius=1.0;
	double P=3.14;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public String toString() {
		return "Circle [radius="+radius+"]";
	}
	@Override 
	public double getPerimeter() {
		return 2*P*radius;
	}
	@Override 
	public double getArea() {
		return P*radius*radius;
	}

}
