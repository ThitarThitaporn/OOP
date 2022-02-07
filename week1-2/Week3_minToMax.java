import java.util.Arrays;
import java.util.Scanner;

class Week3_minToMax{

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter list1 : ");
        int[] list1 = new int[input.nextInt()];
        for(int i = 0 ; i < list1.length ;i++)
        {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2 : ");
        int[] list2 = new int[input.nextInt()];
        for(int i = 0 ; i < list2.length ;i++)
        {
            list2[i] = input.nextInt();
        }

        int L1 = list1.length;
        int L2 = list2.length;
        int[] result = new int[L1 + L2 ];
       

        System.arraycopy(list1, 0, result, 0, L1);
        System.arraycopy(list2, 0, result,L1,L2);
        Arrays.sort(result);
        System.out.println("The merged list is " + Arrays.toString(result));






        




        
    }
}