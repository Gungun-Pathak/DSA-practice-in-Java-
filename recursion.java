public class recursion {
    public static int power(int x,int n){
        if(n==1){
            return 1;
        }
        int Xpowern=power(x,n-1)*x;
        return Xpowern;

    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        
        
    }
    
}
