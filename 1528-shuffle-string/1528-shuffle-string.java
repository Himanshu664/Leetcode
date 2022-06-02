class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuffer ans=new StringBuffer(s);
        for(int i=0;i<s.length();i++){
                ans.setCharAt(indices[i],s.charAt(i));
        }
        return ans.toString();
    }
}