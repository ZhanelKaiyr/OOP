package subtask1;

public class rectangle extends shape {
	protected double width=1.0;
	protected double length=1.0;
	rectangle(String c,boolean f,double w,double l){
		super(c,f);
		width=w;
		length=l;
	}
	rectangle (){
		
	}
	rectangle (double w,double l){
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
	@Override
	public double getArea() {
		return length*width ;
	
	}
	@Override
	public double getPerimeter() {
		return 2*length+2*width;
	}
	@Override
	public String toString() {
		return "Rectangle["+ super.toString()+", width="+width +",length="+length+"]";
	}
}
