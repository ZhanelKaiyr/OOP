package HW1;

public class Point {
	private double x;
	private double y;
	Point (double a, double b){
		x=a;
		y=b;
	}
	 public void setX(double  x){
	        this.x = x;
	    }

	    public void setY(double y){
	        this.y = y;
	    }

	    public double getX(){
	        return x;
	    }

	    public double getY(){
	        return y;
	    }

	    public double distance(Point c){
	    	double x1=c.x;
	    	double y1=c.y;
	        double d = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	        return d;
	    }

	}
