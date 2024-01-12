public class oddOREVEN {
    public static void oddOReven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even number");

        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddOReven(5);
        oddOReven(14);
        
    }
    
}
