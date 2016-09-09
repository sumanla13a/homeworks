package shapes;

final public class Rectangle implements GetShapeAttribute {
	private double length;
	private double width;
	public Rectangle(double aLength, double aWidth) {
		this.length = aLength;
		this.width = aWidth;
	}
	public double computeArea() {
		return this.length * this.width;
	}
}
