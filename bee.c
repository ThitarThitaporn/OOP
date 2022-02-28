// #include <stdio.h>
// int main ()
// {
//     int letter=122,x,y,z;
//     printf("Enter a number : ");
//     scanf ("%d",&x);
//     for (y=1; y<=x ;y++)
//     {
//         for (z=1 ;z<=x ;z++)
//         {
//             printf("%c",letter);
//             letter--;
        
//         }
        
//         printf("\n");
//         letter=122-y;
//     }
//     return 0;
// }

#include<stdio.h>
int main()
{
    int z,i,x,y,count =0;
    printf(" *** Summation of each digit ***\n");
    printf("Enter a positive number : ");
    
            scanf("%d,&x");
    
    printf("\n \n");

        z=x%10 ;
        printf("%d",z);
    
        
    
    
        
        return 0;
}