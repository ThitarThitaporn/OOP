package LAB1;
import java.util.Scanner;

public class Pro1_64011100 {
     public static void main(String[] args) {
          try {
               Scanner input = new Scanner(System.in);
               System.out.print("Enter the index of the array : ");
               int a = input.nextInt();
               input.close();
               int[] x = new int[100];

               for (int i = 0; i < 100; i++) {
                    x[i] = (int) (Math.random() * 100) + 1;
               }

               System.out.print("The corresponding element value : " + x[a] );
          } catch (Exception e) {
               System.out.print("Out of Bounds.");
          }
     }
}