package week1;
import java.util.Scanner;

class Pro4_64011100 {
    public static void main(String[] args) {
        double heightInches, weightPounds, weight_Kg, height_m,BMI;

        System.out.print("Enter weight in pounds : ");

        Scanner input = new Scanner(System.in);

        weightPounds = input.nextDouble();
        System.out.print("Enter height in inches : ");

        heightInches = input.nextDouble();
        weight_Kg = weightPounds * 0.45359237;
        height_m = heightInches * 0.0254;

        BMI=weight_Kg/Math.pow(height_m,2);
        System.out.printf("BMI is %.4f",BMI);
    }
}