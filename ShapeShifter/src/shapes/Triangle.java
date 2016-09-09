package shapes;

final public class Triangle implements GetShapeAttribute {
	private double height;
	private double base;
	
	public Triangle(double aHeight, double aBase) {
		this.height = aHeight;
		this.base = aBase;
	}
	
	public double computeArea() {
		return 1.0/2.0 * this.height * this.base;
	}
}
