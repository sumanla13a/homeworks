package shapes;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<GetShapeAttribute> listOfShapes = new ArrayList<GetShapeAttribute>();
		Triangle aTriangle = new Triangle(3.0,4.0);
		listOfShapes.add(aTriangle);
		Rectangle aRectangle = new Rectangle(3.0,4.0);
		listOfShapes.add(aRectangle);
		Circle aCircle = new Circle(1.0);
		listOfShapes.add(aCircle);
		
		for(GetShapeAttribute entryShape : listOfShapes) {
			System.out.println("Area of a " + entryShape.getClass().getName().toLowerCase().split("\\.")[1] + " = " + entryShape.computeArea());
		}
	}
}
