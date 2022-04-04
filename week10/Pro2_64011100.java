public class Pro2_64011100 {
	public static void main(String[] args) {
		try {
			Triangle triangle = new Triangle(1, 1, 3);
			System.out.println("The Triangle's area is " + triangle.getArea());
		} catch (IllegalTriangleException e) {
			e.printStackTrace();
		}
	}
}