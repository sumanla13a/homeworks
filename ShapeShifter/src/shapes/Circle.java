package shapes;

final public class Circle implements GetShapeAttribute {
	private double radius;
	
	public Circle(double aRadius) {
		this.radius = aRadius;
	}
	
	public double computeArea() {
		return Math.PI * this.radius * this.radius;
	}
}
