#include<stdio.h>
int main(){
    int rem,num,org,arm=0;
    printf("enter the number");
    scanf("%d",&num);
    org=num;
    while(num>0){
        rem=num%10;
        arm=arm+(rem*rem*rem);
        num=num/10;

    }
    if(org==arm){
        printf("armstrong");

        
    }
    else{
        printf("not");
    }
    return 0;
}