#include<stdio.h>
int sum(int n);
int main(){
    printf("the sum of n numbers is %d",sum(5));
    return 0;


}

int sum(int n){
    if(n==1){
        return 1;
    }
    int sumNm1=sum(n-1);
    int sum=sumNm1+n;
    return sum;
}