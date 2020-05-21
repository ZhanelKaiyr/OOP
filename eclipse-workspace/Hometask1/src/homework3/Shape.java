package homework3;

public class Shape {

	public String color="red" ;
	public boolean filled=true;
	Shape (){
		
	}
	Shape (String c, boolean f){
		color=c;
		filled=f;
	}
	public void setColor(String color ) {
		this.color=color ;
	}
	public String getColor() {
		return color;
	}
	public void isFilled(boolean filled) {
		this.filled=filled;
	}
	public boolean getFilled () {
		return filled;
	}
	public  String toString() {
        return "A Shape with color of "+color + " and "+ filled ;
    }
}
