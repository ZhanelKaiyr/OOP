package homework3;

public class Rectangle extends Shape {
	public double width=1.0;
	public double length=1.0;
	Rectangle(String c,boolean f,double w,double l){
		super(c,f);
		width=w;
		length=l;
	}
	Rectangle (){
		
	}
	Rectangle (double w,double l){
		width=w;
		length=l;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getWidth() {
		return width;
	}	
	public void setLength(double length) {
		this.length=length;
	}
	public double getLength() {
		return length;
	}
	public double getArea() {
		return length*width ;
	
	}
	public double getPerimeter() {
		return 2*length+2*width;
	}
	@Override
	public String toString() {
		return "A Rectangle with width="+width +" and length="+length+" , which is a subclass of "+ super.toString();
	}
	}
