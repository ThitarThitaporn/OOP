import java.util.Scanner;

class Pro9_64011100{

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numOfLines = input.nextInt();
        
        for(int rows = 1; rows<= numOfLines; rows++)
        {
            for(int Space = numOfLines - rows; Space>=1; Space--)
            {
                System.out.print("  ");
            }
            for(int left = rows; left >= 2; left--)
            {
                System.out.print(left + " ");
            }
            for(int right = 1; right <= rows; right++)
            {
                System.out.print(right + " ");
            }
            System.out.println();
        }
}
    
}