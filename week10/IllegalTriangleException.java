public class IllegalTriangleException extends Exception {
	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Invalid sides: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3);
	}
}