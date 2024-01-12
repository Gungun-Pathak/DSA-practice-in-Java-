#include<stdio.h>
#include<string.h>
int main(){
    char str[10];
    int i,c=0;
    printf("enter the string");
    gets(str);
    for(int i=0;str[i]!=0;i++){
        c++;
    }
    for(int i=c-1;i>=0;i--){
        printf("%s",str[i]);
        
    }
    return 0;

}