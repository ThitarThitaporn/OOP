package week1;
import java.util.Scanner;

class Pro3_64011100 {
    public static void main(String[] args) {
        int i, j = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        i = input.nextInt();
        if (i > 0 && i < 1000) {
            for (int k = 0; k < 4; k++) {
                j += (i % 10);
                i = i / 10;
            }
            System.out.printf("sum = %d",j);
        }
        else  System.out.print("This number maybe less than 0 or greater than 1000");
    }
}
