package homework3;



public class Main {
	public static void main(String[] args) {

		Shape s= new Shape();
		Circle c=new Circle();
		Rectangle r= new Rectangle();
		Square sq= new Square();
		System.out.println(s);
		System.out.println(c);
		System.out.println(r);
		System.out.println(sq);
		
		s.setColor("green");
		s.isFilled(true);
		System.out.println(s);
		
		c.setRadius(3.0);
		System.out.print(c.getArea());
		System.out.print(c.getPerimeter());
		System.out.println(c);
		
		r.setLength(4.5);
		r.setWidth(1.2);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		System.out.println(r);
		
		sq.setSide(2.3);
		sq.setLength(sq.getSide());
		sq.setWidth(sq.getSide());
		System.out.println(sq.getArea());
		System.out.println(sq.getPerimeter());
		System.out.println(sq);
		
	}
}
