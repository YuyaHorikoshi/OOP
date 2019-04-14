package ex9;

public class Circle extends Ellipse{
	private double r;

	public Circle(double r) {
	super(r,r);
	this.r=r;
	}

	public double getRadius() {
		return r;
	}

	public double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}

	public String toString() {
		return "[" + getRadius()+ "," + getRadius() + "]";

	}

	public double setMajorAxis(double majorAxis) {
		this.r=majorAxis;
		return r;
	}

	public double setMinorAxis(double minorAxis) {
		this.r=minorAxis;
		return r;
	}
}
