#include <stdio.h>
int main ()
{
    int count=0 ,x,i;
    printf ("  Checking for PRIME number. \n");
    printf ("Enter a counting number : ");
    scanf ("%d",&x);
    for (i=1 ; i<=x ; i++)
    {
        if(x%i==0)
        {
            count++ ;
        }
    }

    if (count==2)
    printf("%d is a PRIME number.",x);

    else 
    printf("%d is NOT a prime number.",x);
    return 0;
}