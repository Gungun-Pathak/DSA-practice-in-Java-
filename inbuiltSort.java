import java.util.Arrays;
public class inbuiltSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
        printArray(arr);
    }
    
}
