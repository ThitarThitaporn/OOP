import java.util.Scanner;
import java.lang.Math;

class Pro6_64011100{

    public static void main(String[]args) {
        String[] srp = { "Scissor","Rock","Paper" };
        int rand;

        //Random rand = new Random();
        rand =  (int)(Math.random() * 2);
      

        System.out.print("Scissor (0), Rock (1), Paper(2) : ");
        Scanner input = new Scanner(System.in);
        int inputSRP = input.nextInt();
        
        if(((inputSRP == 0)&&(rand == 2))||((inputSRP == 1)&&(rand == 0))||((inputSRP == 2)&& (rand==1)))
        {
            System.out.printf("The computer is %s. You are %s. You won!!",srp[rand],srp[inputSRP]);
        }

        else if(((inputSRP == 0)&&(rand == 0))||((inputSRP == 1)&&(rand == 1))||((inputSRP == 2)&& (rand==2)))
        {
            System.out.printf("The computer is %s. You are %s too.It is a draw !!",srp[rand],srp[inputSRP]);
        }

        else
        {
            System.out.printf("The computer is %s. You are %s. You lost!!",srp[rand],srp[inputSRP]);
        }

    }
}