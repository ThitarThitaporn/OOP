public class Pro4_64011100 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
      Octagon octagon1 = new Octagon (5); 
      System.out.println("Area:" + octagon1.getArea() + "\nPerimeter: " + octagon1.getPerimeter());
       System.out.println("Cloning Octagon..."); 
       
       Octagon octagon2 = (Octagon) octagon1.clone(); 
       int result = (octagon1.compareTo (octagon2)); 
       if (result == 1) 
       System.out.println("\nOctagon is greather than its clone.\n"); 
       else if (result == -1) 
       System.out.println("\nOctagon is less than its clone.\n"); 
       else 
       System.out.println("\nOctagon is equal to its clone.\n"); 
    }
}