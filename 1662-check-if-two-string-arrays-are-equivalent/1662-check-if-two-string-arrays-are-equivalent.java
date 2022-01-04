class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2){
        boolean ans=false;
        String wordans1="";
        String wordans2="";
        for(int i=0;i<word1.length;i++){
            wordans1+=word1[i];
        }
        for(int j=0;j<word2.length;j++){
            wordans2+=word2[j];
        }
        if(wordans1.equals(wordans2)){
                ans=true;
        }else{
            ans=false;
        }
        return ans;
    }
}