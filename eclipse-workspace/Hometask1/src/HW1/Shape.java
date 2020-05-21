package HW1;
import java.util.ArrayList;
public class Shape {
	private ArrayList<Point> points;

public Shape() {
	points=new ArrayList<Point>();
	
}
	    public void addPoint(Point point) {
	        this.points.add(point);
	    }
	    public void setPoints(ArrayList<Point> points1 ) {
	    	points=points1;
	    	
	    }
	    public Point getPoints(int ind_point) {
	    	return points.get(ind_point);
	    }
	    public Shape(ArrayList<Point> points) {
	    	this.points=points;
	    }


	    public double calculatePerimeter(){
	    	double P=0;
	        for(int i=0;i<points.size()-1;i++)
	        {
	        	Point p1=points.get(i);
	        	Point p2=points.get(i+1);
	        	P=P+p1.distance(p2);
	        }
	        
	        Point s=points.get(0);
	        Point f=points.get(points.size()-1);
	        P=P+s.distance(f);
	        return P;   	
}
	    public double longest() {
	    	Point a=points.get(0);
        	Point b=points.get(1);
	    	double c;
	    	double longest= a.distance(b);
	    	for(int i =0;i<points.size()-1;i++) {
	    		 Point p1 = points.get(i);
	             Point p2 = points.get(i+1);
	             c=p1.distance(p2);
	             if(longest<c){
	                 longest = c;
	             }

	    	}
	    	Point s=points.get(0);
		    Point f=points.get(points.size()-1);
		    c=s.distance(f);
		    if(longest<c){
                longest = c;
            } 
	    	return longest;
	    }
	    public double average() {
	    	double average=0;
	    	double sum=0 ;
	    	for (int i=0; i<points.size()-1;i++) {
	    		 Point p1 = points.get(i);
	             Point p2 = points.get(i+1);
	    		sum=sum+p1.distance(p2);
	    	}
	    	 Point s=points.get(0);
		     Point f=points.get(points.size()-1);
		     sum=sum+s.distance(f);
	    	average=sum/points.size()+1;
	    	return average ;
	    }
	    
	    
}
