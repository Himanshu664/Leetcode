class Solution {
    public int majorityElement(int[] nums) {
        int val=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(val==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                val=nums[i];
                count=1; 
            }
        }
        int countMaj=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                countMaj++;
            }
        }
        if(countMaj>nums.length/2){
            return val;
        }
        
//         if(nums.length==1){
//             return nums[0];
//         }
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }    
//             }
//           if(count>(nums.length)/2){
//                     return nums[i];
//                 }
//         }
//         return -1;
//         Arrays.sort(nums);
//         return nums[nums.length/2];
        return -1;
    }
}