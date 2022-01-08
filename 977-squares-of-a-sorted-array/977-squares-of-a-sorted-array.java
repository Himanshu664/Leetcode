class Solution {
    public int[] sortedSquares(int[] nums) {
       // int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
         Arrays.sort(nums);
        // for(int i=0;i<ans.length-1;i++){
        //     if(ans[i]>=ans[i+1]){
        //         int temp=ans[i];
        //         ans[i]=ans[i+1];
        //         ans[i+1]=temp;
        //     }
        // }
        return nums;
    
    }
}