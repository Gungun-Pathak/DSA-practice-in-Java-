#include<stdio.h>
int calcArea(int n);
int main(){
    
    printf("the area is %d",calcArea(5));
    
    
    return 0;


}
int calcArea(int n){
    
    return n*n;
}