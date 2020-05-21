package subtask1;

public class square extends rectangle{
	
	square(String c,boolean f,double s){
	super(c,f,s,s);
	}
	square (){
		super(1.0,1.0);
		
	}
	square (double s){
		
	}
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	public double getSide() {
		return super.getLength();
	}
	@Override 
	public void setWidth(double side) {
		super.setWidth(side);
	}
	@Override 
	public void setLength(double side) {
		super.setLength(side);
	}
	@Override
	public String toString() {
		return "A Square["+super.toString() +"]";
	}
}
