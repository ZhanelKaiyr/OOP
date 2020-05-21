package HW1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentOne {
public static void main(String args[])throws FileNotFoundException{
	Shape shape=new Shape();
	Scanner file=new Scanner (new File ("C:\\Users\\Админ\\Desktop\\file1.txt"));
			while (file.hasNextDouble()) {
				double x=file.nextDouble();
				double y=file.nextDouble();
				Point a=new Point(x,y);
				shape.addPoint(a);
				System.out.println(x+" "+y);
			}
	System.out.println(shape.calculatePerimeter());
	System.out.println(shape.longest());
	System.out.println(shape.average());

	file.close();
}
}
