class Solution {
    public boolean isPalindrome(String s) {
        String ans = s.replaceAll("[^A-Za-z0-9]", "");
        ans=ans.toLowerCase();
        String rev = new StringBuffer(ans).reverse().toString();
        return ans.equals(rev);
    }
}