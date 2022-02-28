public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square(){
        super();
    }

    public Square(double side){
        super();
        this.side= side;
    }

    public Square(double side,String color,Boolean filled){
        super(color,filled);
        this.side = side;
    }

    @Override
    public void howToColor(){
        System.out.println("color all four side.");

    }

    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter()
    {
        return side;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Perimeter = " +getPerimeter() + "\n" +"Area = " + getArea();
    }
}