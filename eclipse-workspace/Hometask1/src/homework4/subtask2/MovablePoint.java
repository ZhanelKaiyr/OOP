package subtask2;

public class MovablePoint implements Movable  {
 int x;
 int y;
 int xSpeed;
 int ySpeed;

public MovablePoint(int x, int y, int xSpeed, int ySpeed){
	this.x=x;
	this.y=y;
	this.xSpeed=xSpeed;
	this.ySpeed=ySpeed;
}
public void setX(int x) {
	this.x=x;
}
public int getX() {
	return x;
}
public void setY(int y) {
	this.y=y;
}
public int getY() {
	return y;
}
public void setXSpeed(int xSpeed) {
	this.xSpeed=xSpeed;
}
public int getXSpeed() {
	return xSpeed;
}
public void setYSpeed(int ySpeed) {
	this.ySpeed=ySpeed;
}
public int getYSpeed() {
	return ySpeed;
}
@Override 
public void moveUp() {
	y++;
}
@Override 
public void moveDown() {
	y--;
}
@Override 
public void moveLeft() {
	x--;
}
@Override 
public void moveRight() {
	x++;
}
public String toString() {
	return "Movable Point["+"X="+x+" , Y="+y+" , xSpeed="+xSpeed+", ySpeed="+ySpeed+"]";
}
}
