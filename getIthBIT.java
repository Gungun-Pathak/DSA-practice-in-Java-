public class getIthBIT {
    public static void getITHbit(int n,int i){
       
       
       int bitmass=1<<i;
       if((n&(1<<i))==0){
        System.out.println("ith bit is 0");
       }
       else{
        System.out.println("ith bit is 1");
       }


    }
    public static void main(String[] args) {
        getITHbit(15, 2);
        
    }
    
}
