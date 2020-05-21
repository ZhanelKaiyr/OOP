package subtask2;

public class Main {
public static void main(String[] args) {
	MovablePoint point=new MovablePoint(1,1,5,5);
	System.out.println(point);
	point.moveDown();
	point.moveLeft();
	point.moveLeft();
	System.out.println(point);
	point.moveRight();
	point.moveRight();
	point.moveUp();
	System.out.println(point);
	
	MovableCircle circle=new MovableCircle(0,1,3,3,2);
	circle.moveLeft();
	circle.moveLeft();
	circle.moveLeft();
	circle.moveUp();
	System.out.println(circle);
	circle.moveRight();
	circle.moveDown();
	circle.moveDown();
	circle.moveDown();
	System.out.println(circle.getRedius());
	circle.setRadius(6);
	System.out.println(circle);
	
	
	
	
}



}