#include <stdio.h>
int main ()
{
    int letter=122,x,y,z;
    printf("Enter a number : ");
    scanf ("%d",&x);
    for (y=1; y<=x ;y++)
    {
        for (z=1 ;z<=x ;z++)
        {
            printf("%c",letter);
            letter--;
        
        }
        
        printf("\n");
        letter=122-y;
    }
    return 0;
}