package homework3;

public class Square extends Rectangle  {
	public double side;
	Square(String c,boolean f,double w,double l,double s){
	super(c,f,w,l);
	side=s;
	}
	Square (){
		
	}
	Square (double s){
		
	}
	public void setSide(double side) {
		this.side=side;
	}
	public double getSide() {
		return side;
	}
	@Override 
	public void setWidth(double side) {
		super.setWidth(side);
	}
	@Override 
	public void setLength(double side) {
		super.setLength(side);
	}
	public String toString() {
		return "A Square with side="+side +", which is a subclass of "+super.toString();
	}
}
