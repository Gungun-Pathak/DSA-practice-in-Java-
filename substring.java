public class substring {
    public static String substring1(String str,int si,int ei){
     String   substring="";
     for(int i=0;i<ei;i++){
        substring+=str.charAt(i);
     }
     return substring;


    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(substring1(str,0,5));
        
    }
    
}
