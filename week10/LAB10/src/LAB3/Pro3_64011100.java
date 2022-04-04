package LAB3;
import java.io.*;

public class Pro3_64011100 {
     public static void main(String[] args) {
          File text = new File("Salary.txt");
          try {
               String[] rank = {"assistant" , "associate" , "full"};
               PrintWriter write = new PrintWriter(text);
               for (int i = 0; i < 1000; i++) {
                    int status = (int) (Math.random() * 3);
                    write.write("FirstName" + i+1 + " LastName" + i+1 + " " + rank[status] + " ");
                    Double salary;
                    if (status == 0) {
                         salary = 50000 + (double) (Math.random() * 30001);
                    }
                    else if (status == 1) {
                         salary = 60000 + (double) (Math.random() * 50001);
                    }
                    else {
                         salary = 75000 + (double) (Math.random() * 55001);
                    }
                    write.printf("%.2f \n",salary);
               }
               write.close();
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}