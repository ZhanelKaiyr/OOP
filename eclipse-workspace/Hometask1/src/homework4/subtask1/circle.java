package subtask1;

public class circle extends shape  {
	protected double radius=1.0;	
	double  P=3.14;
	circle(){
		
	}
	circle(double radius){
		this.radius=radius;
	}
	
	circle(String c, boolean f, double r) {
		super(c,f );
		radius=r;
}
	public void setRadius(double radius) {
		this.radius=radius ;
	}
	public double getRadius() {
		return radius;
	} 
	@Override
	public double getArea() {
		return P*radius*radius;
		
	}
	@Override
	public double getPerimeter() {
		return 2*P*radius;
	}
	@Override
    public String toString(){
         return "Circle["+super.toString()+" ,radius="+radius +"]";
    }

}
