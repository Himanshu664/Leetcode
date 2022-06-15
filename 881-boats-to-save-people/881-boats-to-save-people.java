class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boatCount=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                boatCount++;
                i++;
                j--;
            }else if(sum>limit){
                int max=Math.max(people[i],people[j]);
                if(max==people[i]){
                    boatCount++;
                    i++;
                }else{
                    boatCount++;
                    j--;
                }
            }
        }
        return boatCount;
    }
}