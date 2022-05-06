import java.util.Arrays;
import java.util.Scanner;

public class program1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 : ");
        int[] list1 = new int[input.nextInt()];
        for(int i = 0; i< list1.length; i++){
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2 : ");
        int[] list2 = new int[input.nextInt()];
        for(int i = 0; i< list2.length; i++){
            list2[i] = input.nextInt();
        }

        Arrays.sort(list1);
        Arrays.sort(list2);

        int length1 = list1.length;
        int length2 = list2.length;
        int[] merge = new int[length2+length1];

        System.out.print("The merge list is ");
        System.arraycopy(list1, 0, merge, 0, list1.length);
        System.arraycopy(list2, 0, merge, list1.length, list2.length);
        Arrays.sort(merge);
        for(int i = 0; i< merge.length; i++){
            System.out.print(merge[i] + " ");
        }
    }
}