class Solution {
    public int maxDepth(String s) {
      int dep=0;
      int open=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                open++;
            }
            if(c==')'){
                open--;
            }
            dep=Math.max(dep,open);
        }
        return dep;
    }
}