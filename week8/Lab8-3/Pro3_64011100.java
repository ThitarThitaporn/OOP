

public class Pro3_64011100 {

    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(5,10);
        Rectangle rect2 = new Rectangle(55,61);

        System.out.println("Rect1 Area : " + rect1.getArea());
        System.out.println("Rect1 Area : " + rect2.getArea());
        System.out.println("\nIs area of rect1 and rect2 equal?\n" + rect1.compareTo(rect2) + "\n");

    }
}