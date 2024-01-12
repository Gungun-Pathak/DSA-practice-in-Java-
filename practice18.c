#include<stdio.h>
int fib(int n);
int main(){
    fib(5);
    printf("the fib of %d is %d\n",2,fib(2));
    return 0;


}
int fib(int n){
    if(n==0)
    return 0;
    if(n==1)
    return 1;
    int fibNm1=fib(n-1);
    int fibNm2=fib(n-2);
    int fib=fibNm1+fibNm2;
    return fib;
    
    return 0;
}