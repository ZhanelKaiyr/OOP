package subtask3;

public class Main {
	public static void main(String[] args) { 
//test Circle
	Circle circle=new Circle(1.5);
	System.out.println(circle.getArea());
	System.out.println(circle.getPerimeter());
	circle.setRadius(3);
	System.out.println(circle.getArea());
	System.out.println(circle);
	//test Resizable
	ResizableCircle rcircle=new ResizableCircle(9.0);
	System.out.println(rcircle);
	System.out.println(rcircle.getArea());
	System.out.println(rcircle.getPerimeter());
	rcircle.setRadius(5);
	rcircle.resize(50);
	System.out.println(rcircle);
	
	
	}
}
