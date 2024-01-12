#include<stdio.h>
int main(){
    int a,b,c;
    printf("enter the value of a\n");
    scanf("%d",&a);
     printf("enter the value of b\n");
    scanf("%d",&b);
     printf("enter the value of c\n");
    scanf("%d",&c);
    int sum=a+b+c;
    int avg=sum/3;
    printf("sum is %d",sum);
    printf("average is %d",avg);
    return 0;


}