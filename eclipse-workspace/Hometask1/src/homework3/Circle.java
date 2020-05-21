package homework3;

public class Circle  extends Shape {
	public double radius=1.0;	
	double  P=3.14;
	Circle(){
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	
	Circle(String c, boolean f, double r) {
		super(c,f );
		radius=r;
}
	public void setRadius(double radius) {
		this.radius=radius ;
	}
	public double getRadius() {
		return radius;
	} 
	public double getArea() {
		return P*radius*radius;
		
	}
	public double getPerimeter() {
		return 2*P*radius;
	}
	@Override
    public String toString(){
         return "A Circle with radius="+radius +", which is a subclass of "+ super.toString();
    }

}

