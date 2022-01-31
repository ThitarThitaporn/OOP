class Week3_Palindrom
{
    static int prime(int n) 
    {
        if (n <= 1)
            return 0;// 0,1 not prime number
         for (int i = 2; i <= Math.sqrt(n); i++)
         {
            if (n % i == 0)
                return 0;//not prime number
         }
    return 1;//prime number
    }

    static int palindrome(int n)
    {
        int remainder , reversed = 0 , original;
        original = n;

        while(n != 0)
        {
            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;   
        }
        if(original == reversed)    
            return 1;//palindrome number
        else     
            return 0;//not palindrome  
    } 

    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 0 ; i < 100000 ; i++)
        {
            if(count < 100 && prime(i)==1 && palindrome(i)==1)
            {
                System.out.print(i + "  ");
                count++;
                if(count%10==0)
                    System.out.print("\n");
            }
        }
    }
}