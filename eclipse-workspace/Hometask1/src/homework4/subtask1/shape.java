package subtask1;

public abstract class shape {

	protected String color="red" ;
	protected boolean filled=true;
	shape (){
		
	}
	shape (String c, boolean f){
		color=c;
		filled=f;
	}
	public void setColor(String color ) {
		this.color=color ;
	}
	public String getColor() {
		return color;
	}
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	public boolean isFilled () {
		return filled;
	}
	abstract double getArea() ;
	abstract double getPerimeter();
	public  String toString() {
        return "Shape [color="+color + " ,filled="+ filled+"]" ;
    }
}

