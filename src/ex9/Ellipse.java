package ex9;

public class Ellipse {
	private double majorAxis;
	private double minorAxis;

	public Ellipse(double majorAxis, double minorAxis) {
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}

	public double getMajorAxis() {
		return majorAxis;
	}

	public double getMinorAxis() {
		return minorAxis;

	}

	public double getArea() {
		return Math.PI * getMajorAxis() * getMinorAxis();

	}

	public String toString() {
		return "[" + getMajorAxis() + "," + getMinorAxis() + "]";

	}

	public double setMajorAxis(double majorAxis) {
		this.majorAxis = majorAxis;
		return majorAxis;
	}

	public double setMinorAxis(double minorAxis) {
		this.minorAxis = minorAxis;
		return minorAxis;
	}

}
