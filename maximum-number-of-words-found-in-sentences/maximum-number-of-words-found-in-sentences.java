class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int count=0;
            String ans=sentences[i];
                for(int j=0;j<ans.length();j++){
                    if(ans.charAt(j)==' '){
                        count++;
                    }
                }
            max=Math.max(max,count);
           
        }
        return max+1;
    }
}