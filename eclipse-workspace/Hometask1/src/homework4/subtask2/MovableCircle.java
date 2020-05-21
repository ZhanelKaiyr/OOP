package subtask2;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;
	public MovableCircle(int x,int y,int xSpeed,int ySpeed, int radius) {
		this.radius=radius;
		this.center = new MovablePoint(x,y ,xSpeed,ySpeed) ;
	
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRedius() {
		return radius;
	}
	public void setCenter(MovablePoint center) {
		this.center=center;
	}
	public MovablePoint getCenter() {
		return center;
		
	}
	@Override 
	public void moveUp() {
		center.moveUp();
	}
	@Override 
	public void moveDown() {
		center.moveDown();
	}
	@Override 
	public void moveLeft() {
		center.moveLeft();
	}
	@Override 
	public void moveRight() {
		center.moveRight();
	}
	@Override 
	public String toString() {
		return "Movable Circle["+"radius="+radius+", center="+center+"]" ;
		
	}
}