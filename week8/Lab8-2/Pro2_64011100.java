public class Pro2_64011100 {
    public static void main(String[] args) {
      GeometricObject[] square = {new Square(4, "Green", true), new Square(5, "Red", true), new Square(6, "Black", true), new Square(7, "Pink", true), new Square(8, "Blue", true)};
      for (int i = 0; i< square.length; i++){
          System.out.println(square[i]);
          ((Square)square[i]).howToColor();
          System.out.println();
      }
    }
}