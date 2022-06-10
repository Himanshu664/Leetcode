class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!list.contains(nums[i])){
           int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(n/3)){
                list.add(nums[i]);
            }
        }
       }
        return list;
    }
}