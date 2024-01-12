public class decTobin {
    public static void dectobin(int n){
        
        int pow=0;
        int binNum=0;
        int myNum=n;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)(Math.pow(10,pow)));
            pow++;
            n=n/2;
        }
        System.out.println("binNum form is"+myNum+"="+binNum);
    }
    public static void main(String[] args) {
        dectobin(7);
        
    }
    
}
