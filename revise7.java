public class revise7 {
    public static void printArr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }

            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2,5};
        selectionSort(arr);
        printArr(arr);
        
    }
    
}
