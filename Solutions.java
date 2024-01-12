public class Solutions {
    public static  void twoSum(int nums[], int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+","+j);
                }
                else{
                i++;j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int target=9;
        int nums[]={2,7,11,15};
        twoSum(nums, target);


        
    }
    

}
